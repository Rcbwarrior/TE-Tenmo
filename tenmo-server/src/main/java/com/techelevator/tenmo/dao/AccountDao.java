package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.exception.AccountNotFoundException;
import com.techelevator.tenmo.model.User;

import java.util.List;

public interface AccountDao {

    List<User> listOfUsers (int userId) throws AccountNotFoundException;
}
