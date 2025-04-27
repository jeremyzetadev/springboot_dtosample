package com.sample.DTOsample.service;

import com.sample.DTOsample.dto.UserLocationDTO;
import com.sample.DTOsample.model.User;
import com.sample.DTOsample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

public interface UserService {

    List<UserLocationDTO> getAllUsersLocation();

    UserLocationDTO convertEntityToDTO(User user);
}
