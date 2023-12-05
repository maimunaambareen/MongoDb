package com.example.Mongodb.repository;

import com.example.Mongodb.model.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListingRepository extends MongoRepository<Listing,String> {

}
