package com.driver.services;


import com.driver.model.Payment;
import com.driver.model.Reservation;
import com.driver.model.User;
import io.swagger.models.auth.In;

import java.util.List;

public interface UserService {

	void deleteUser(Integer userId);
	User updatePassword(Integer userId, String password);
    void register(String name, String phoneNumber, String password);
}
