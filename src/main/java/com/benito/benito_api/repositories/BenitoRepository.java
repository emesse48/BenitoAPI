package com.benito.benito_api.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.benito.benito_api.BenitoApiApplication;

public interface BenitoRepository extends MongoRepository<BenitoApiApplication, String>{
	BenitoApiApplication findBy_id(ObjectId _id);
}
