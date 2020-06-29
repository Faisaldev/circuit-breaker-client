package com.aljazira.circuitbreaker.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAlbums(){
        return"Hello World";
    }
}



