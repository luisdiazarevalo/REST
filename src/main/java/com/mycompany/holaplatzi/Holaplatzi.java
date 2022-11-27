/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package com.mycompany.holaplatzi;
import static spark.Spark.*; 
/**
 *
 * @author SALA H
 */
public class Holaplatzi {

 public static void main(String[] args) { 
     get("/hello", (req, res) -> "Hola Platzi. Saludos desde Peewah.");

} 
} 
