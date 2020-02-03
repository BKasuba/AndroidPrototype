package com.example.appprototype4;

import android.content.Context;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Data {


    public static String fetchData(Context applicationContext){
        String result = "";

        //Toast toast1=Toast. makeText(applicationContext,"Hello Javatpoint",Toast. LENGTH_SHORT);
        //toast1. setMargin(50,50);
        //toast1. show();
        String pos = "0";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            pos += "1";
            Connection con= DriverManager.getConnection("jdbc:mysql://172.31.82.118:3306/stasha_db","root","my-secret-pw");
            pos +="2";
            Statement stmnt = con.createStatement();
            pos +="3";

            ResultSet rs = stmnt.executeQuery("select * from uniEvents");
            pos +="4";
            result = rs.getString(3);
            pos +="5";
            Toast toast=Toast. makeText(applicationContext,result,Toast. LENGTH_SHORT);

            toast. setMargin(50,50);
            toast. show();


        }catch(Exception e){
            Toast toast=Toast. makeText(applicationContext,pos + " " + e.getMessage(),Toast. LENGTH_LONG);
            toast. setMargin(50,50);
            toast. show();

        }
        return result;
    }
}
