package com.AzureRestApi.restApiAzure.controller.Repo;

import org.springframework.stereotype.Repository;

import com.AzureRestApi.restApiAzure.Model.User;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<User, Integer> {

}
