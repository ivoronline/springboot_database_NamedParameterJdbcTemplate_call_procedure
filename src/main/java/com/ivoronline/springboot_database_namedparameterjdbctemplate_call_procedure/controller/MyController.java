package com.ivoronline.springboot_database_namedparameterjdbctemplate_call_procedure.controller;

import com.ivoronline.springboot_database_namedparameterjdbctemplate_call_procedure.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // CALL PROCEDURE
  //=========================================================================================================
  // http://localhost:8080/callProcedure?name=John&age=50
  @ResponseBody
  @GetMapping("/callProcedure")
  public Integer callProcedure(@RequestParam String name, @RequestParam Integer age) {
    return myService.callProcedure(name, age);
  }

}
