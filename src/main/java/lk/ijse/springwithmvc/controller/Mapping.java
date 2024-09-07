package lk.ijse.springwithmvc.controller;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("map")
public class Mapping {
    @GetMapping("hello??")               //postman eke eka letter  ekakata wada type karanna puluwan
    public String helloMappingPart1() {
        return "Hello Mapping";
    }

    @GetMapping("test/**")              //http://localhost:8081/map/test/heloo   path segment ekakata allow weno
    public String helloMappingPart2() {   //http://localhost:8081/map/test/heloo/helooo/hi  path segmanet dekakata wada allowe weno
        return "Hello Mapping with *";    //wildcart mapping walata samanai
    }


    @PostMapping("/{name}/{value}")
    public String helloMappingPart3(@PathVariable("name") String name, @PathVariable("value") int value) {
        return "PathVariable are " + name + "and " + value;  //http://localhost:8081/map/Dinali /50
    }


    @PostMapping("/{id:S\\d{4}}")
    public String helloMappingPart4(@PathVariable("id") String id) {  //http://localhost:8081/map/S0001
        return "Patters accept path variable is " + id;
    }

    @PostMapping(params = {"name", "age"})   //http://localhost:8081/map?
    public String helloMappingPart5(@RequestParam("name") String myName, @RequestParam("age") int myAge) {
        return "Path variables are " + myName + " and " + myAge;
    }


    @PostMapping(headers = {"X-city", "Content-Type"})    // custom headers
    public String helloMappingPart6(@RequestHeader("X-city") String myCustomHeader, @RequestHeader("Content-Type") String myContentTypeHeader) { //http://localhost:8081/map
        return "My City is " + myCustomHeader + " and  My Content-Type Header is " + myContentTypeHeader;

    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String helloMappingPart7() {
        return "JSON mine type Handle";
    }

}
