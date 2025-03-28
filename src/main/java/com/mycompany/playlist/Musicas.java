/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playlist;

/**
 *
 * @author SAM
 */
public class Musicas {
    //Atributos
    String title;
    String album;
    String date;
    int time;
    
    //Metodos
    /*public void Musicas(String _title, String _album, String _date, int _time){
        title=_title;
        album=_album;
        date=_date;
        time=_time;
    }*/
    
    public Musicas(String title, String album, String date, int time){
        this.title=title;
        this.album=album;
        this.date=date;
        this.time=time;
    }
    
    public void ShowPlaylist(){
        System.out.print("Title: "+title);
        System.out.print("Album: "+album);
        System.out.print("Date: "+date);
        System.out.print("Time: "+time);
    }
}
