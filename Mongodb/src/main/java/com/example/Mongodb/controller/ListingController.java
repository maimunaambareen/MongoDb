package com.example.Mongodb.controller;


import com.example.Mongodb.model.Listing;
import com.example.Mongodb.repository.ListingRepository;
import com.example.Mongodb.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class ListingController {

    @Autowired
   ListingRepository listingRepository;

    @Autowired
    SearchRepository searchRepository;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
      response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/getAllListing")
    public List<Listing> getAllPosts(){
      return listingRepository.findAll();
    }

    @GetMapping("/Listing/{searchKeyword}")
    public List<Listing> search(@PathVariable String searchKeyword ){
      return searchRepository.findByKeyword(searchKeyword);
    }

    @PostMapping("/postListing")
    public Listing addPost(@RequestBody Listing listing){
        return listingRepository.save(listing);
    }
}
