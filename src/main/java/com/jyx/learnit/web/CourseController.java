package com.jyx.learnit.web;

import com.jyx.learnit.domain.Course;
import com.jyx.learnit.repository.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {

        this.courseRepository = courseRepository;
    }

    @RequestMapping("/new")
    public String navigateCourseForm(Model model) {
        Course course = new Course();
        model.addAttribute("course", course);
        return "courses/courseForm";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createCourse(Course course, Model model) {
        courseRepository.save(course);
        return "redirect:/courses/new";
    }
}
