package com.schooljorgina.apischool.controller;

import com.schooljorgina.apischool.model.CreateAccount;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CreateAccountController {

    @GetMapping
    public String createAccount(Model model){
        model.addAttribute("createAccount", new CreateAccount());
        return "createAccount";
    }

    @PostMapping("/conta-criada")
    public Object saveProject(@Valid CreateAccount createAccount, BindingResult bindingResult) {
        ModelAndView mv = new ModelAndView("success");

        mv.addObject("message", "Conta criada com sucesso");
        if (bindingResult.hasErrors()){
            return "redirect:/";
        }

        if (createAccount.getNome().isEmpty()){
            System.out.println("O nome é obrigatorio");
            mv.addObject("error", "Nome é obrigatorio");
            return mv;
        }
        return mv;
    }

}
