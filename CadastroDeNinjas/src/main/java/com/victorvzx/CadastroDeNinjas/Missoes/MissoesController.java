package com.victorvzx.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missoes")
    public String missoesList(){
        return "missões";
    }


}
