package com.prof.com.profile;

import com.prof.com.profile.com.prof.com.profile.dto.ProfileUserDto;
import com.prof.com.profile.com.prof.com.profile.impl.InterfaceProf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NorepeatController {



    @Autowired
    InterfaceProf interfaceProf;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/profile")
    public List<String> getlist(){
        return interfaceProf.getlist();

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/register")
     public  int savedata(@RequestBody ProfileUserDto prof){
        return interfaceProf.savedata(prof);
    }

 }

