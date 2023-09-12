package com.schooljorgina.apischool.controller;

import com.schooljorgina.apischool.model.CreateAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/criar-conta")
public class CreateAccountController {

    @GetMapping
    public String createAccount(Model model){
        model.addAttribute("createAccount", new CreateAccount());
        return "createAccount";
    }

    @PostMapping("/conta-criado-com-sucesso")
    public ModelAndView saveUser(CreateAccount createAccount){
        ModelAndView mv = new ModelAndView("msgSuccess");
        mv.addObject("message", "Conta criado com sucesso");
        return mv;
    }

}
