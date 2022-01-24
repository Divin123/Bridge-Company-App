package com.example.BridgeCompanyApp.Controller;

import com.example.BridgeCompanyApp.Entity.Department;
import com.example.BridgeCompanyApp.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentRepository repository;
    @GetMapping("/Department")
    public String viewDepartment(Model model){
        model.addAttribute("model", repository.findAll());
        return "DepartmentList";
    }


}
