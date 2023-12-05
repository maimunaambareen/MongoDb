package com.example.Mongodb.repository;

import com.example.Mongodb.model.Listing;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class SearchRepositoryImpl implements SearchRepository{
    @Override
    public List<Listing> findByKeyword(String keyword) {
        final List<Listing> listings= new ArrayList<>();

        
        return listings;
    }
}
