package com.sm2k4.carty.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sm2k4.carty.DTOs.CartDTO;

@Service
public class CartServiceImpl implements CartService {

    private RestTemplate restTemplate;
    private String BaseURL = "https://fakestoreapi.com/carts";

    public CartServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    public List<CartDTO> getAllCarts() {
        String URL = BaseURL;

        CartDTO[] allCarts = this.restTemplate.getForObject(URL, CartDTO[].class);

        List<CartDTO> allCartsList = new ArrayList<>();

        for (CartDTO cart : allCarts) {
            allCartsList.add(cart);
        }

        return allCartsList;
    }

    public CartDTO getCartById(int id) {
        String URL = BaseURL + String.format("/%d", id);

        CartDTO cartById = this.restTemplate.getForObject(URL, CartDTO.class);

        return cartById;
    }

    public List<CartDTO> getCartsFilterByDate(String startdate, String enddate) {
        String URL = BaseURL + String.format("?startdate=%s&enddate=%s", startdate, enddate);

        CartDTO[] cartsFilterByDate = this.restTemplate.getForObject(URL, CartDTO[].class);
        List<CartDTO> cartsFilterByDateList = new ArrayList<>();

        for (CartDTO cartByDate : cartsFilterByDate) {
            cartsFilterByDateList.add(cartByDate);
        }

        return cartsFilterByDateList;
    }
}
