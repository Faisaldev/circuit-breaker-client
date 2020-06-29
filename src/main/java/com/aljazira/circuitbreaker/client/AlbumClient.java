package com.aljazira.circuitbreaker.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name ="albums-service",url = "http://localhost:8081",fallback =)
public interface AlbumClient extends AlbumController{

    public static class AlbumClientFallback implements AlbumController
}
