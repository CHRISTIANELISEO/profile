package com.prof.com.profile.com.prof.com.profile.impl;

import com.prof.com.profile.com.prof.com.profile.dto.ProfileUserDto;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Component
public class implementationProf implements InterfaceProf {

    /*public void view() {
        String str= "Spring boot is part of the Spring framework";
        String cadena [];
        
        for(int i=0; i< str.length();i++){
            for(int j=0; j<str.length();j++){
                cadena = str.split(" ");
                if(cadena[i].equals(cadena[j])){
                    System.out.println("is the same");
                }else{
                    System.out.println("no is the same");
                }
            }
        }
    }
*/
    @Override
    public List<String> getlist() {
        List<String> list = new ArrayList<String>();
        list.add("1 Christian");
        list.add("2 Mario");
        return list;
    }

    @Override
    public int savedata(ProfileUserDto prof) {
        int status=0;
        try{
         Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("insert into prodprofile(USER,PASSWORD,EMAIL) values(?,?,?)");
            ps.setString(1,prof.getUser());
            ps.setString(2,prof.getPassword());
            ps.setString(3,prof.getEmail());
            status = ps.executeUpdate();
        }catch(Exception e){

        }
        return status;
    }

    public Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/profileProd","root","root");
        }catch(Exception e){

        }
        return con;
    }
}
