package com.example.BridgeCompanyApp.Controller;


import com.example.BridgeCompanyApp.Repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailsController {
    @Autowired
    private DetailsRepository repository;

    @GetMapping("/Details")
    public String viewDetails(Model model){
      model.addAttribute("DetailList", repository.findAll());
              return "index";
}
}
