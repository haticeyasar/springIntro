package com.example.springExample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class HelloController {

    //llocallhost:8080/api/hello

    //GET: Veri görüntülemek istediğimiz zaman kullanıyoruz.  @GetMapping
    //POST: Veri kaydetmek istediğimiz zaman kullanıyoruz.    @PostMapping
    //PUT: Veri güncellemek için  kullanıyoruz.               @PutMapping
    //PATCH: Veri bir bölümünü güncellemk için  kullanıyoruz. @PatchMapping  örn;parola güncelleme
    //DELETE: Veri silmek için  kullanıyoruz.                 @DeleteMapping
    //@GetMapping(path="/hello")
    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World!";
    }

    @PostMapping("/save")
    public String save(){
        return "Data saved!";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted!";
    }
}
