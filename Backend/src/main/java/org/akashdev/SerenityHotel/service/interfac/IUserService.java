package org.akashdev.SerenityHotel.service.interfac;

import org.akashdev.SerenityHotel.dto.LoginRequest;
import org.akashdev.SerenityHotel.dto.Response;
import org.akashdev.SerenityHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}