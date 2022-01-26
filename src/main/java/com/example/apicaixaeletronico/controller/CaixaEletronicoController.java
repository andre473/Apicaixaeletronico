package com.example.apicaixaeletronico.controller;

import com.example.apicaixaeletronico.dto.DepositoDTO;
import com.example.apicaixaeletronico.dto.SaqueDTO;
import com.example.apicaixaeletronico.service.CaixaEletronicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caixa-eletronico")
public class CaixaEletronicoController {

    @Autowired
    private CaixaEletronicoService service;

    @GetMapping("/iniciar")
    public String iniciar() {

        service.iniciaCaixa();
        return "OK";

    }

    @PutMapping("/saque")
    public String sacar(@RequestBody SaqueDTO dto){
        System.out.println(dto);
        return service.sacar(dto);
    }

    @PutMapping("/deposito")
    public String deposito (@RequestBody DepositoDTO dto){
        return service.depositar(dto);
    }
}
