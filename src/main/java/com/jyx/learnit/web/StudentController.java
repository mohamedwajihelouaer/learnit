package com.jyx.learnit.web;

import com.jyx.learnit.domain.Student;
import com.jyx.learnit.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String allStudents(Model model) {
        var studs = studentRepository.findAll();
        model.addAttribute("students", studs);
        return "students/students";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getStudent(Model model) {
        model.addAttribute("formData", new Student());
        return "students/studenForm";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processFormData(Student student, RedirectAttributes attr) {
        attr.addFlashAttribute("student", student);
        return "redirect:/students/student_page";
    }

    @RequestMapping(value = "/student_page")
    public String studentPage(Student student) {
        return "student_page";
    }
}
