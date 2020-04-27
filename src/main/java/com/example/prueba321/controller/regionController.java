package com.example.prueba321.controller;

import com.example.prueba321.entity.Region;
import com.example.prueba321.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/region")
public class regionController {

    @Autowired
    RegionRepository regionRepository;

    @GetMapping( value ={"", "/listaR"} )
    public String listaDeRegiones(Model model){
        List<Region> lista_regiones = regionRepository.findAll();
        model.addAttribute("listaR",lista_regiones);

        return "region/lista";
    }

}
