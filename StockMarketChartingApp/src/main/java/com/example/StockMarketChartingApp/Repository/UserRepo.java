package com.example.StockMarketChartingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StockMarketChartingApp.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
