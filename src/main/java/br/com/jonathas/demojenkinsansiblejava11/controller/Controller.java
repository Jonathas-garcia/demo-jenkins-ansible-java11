package br.com.jonathas.demojenkinsansiblejava11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class Controller {

    @GetMapping
    public String demo() {
        return "HELLO WORLD ANSIBLE/JENKINS/DOCKER";
    }

}
