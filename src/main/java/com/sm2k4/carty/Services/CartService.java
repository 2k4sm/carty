package com.sm2k4.carty.Services;

import java.util.List;

import com.sm2k4.carty.DTOs.CartDTO;

public interface CartService {
    public List<CartDTO> getAllCarts();
    public CartDTO getCartById(int id);
}
