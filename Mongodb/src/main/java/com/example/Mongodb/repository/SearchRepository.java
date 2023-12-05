package com.example.Mongodb.repository;

import com.example.Mongodb.model.Listing;

import java.util.List;

public interface SearchRepository {
   List<Listing> findByKeyword(String keyword);
}
