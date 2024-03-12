package com.sm2k4.carty.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
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

    public List<CartDTO> getCartsByUserId(int id) {
        String URL = BaseURL + String.format("/user/%d", id);

        CartDTO[] cartsByUser = this.restTemplate.getForObject(URL, CartDTO[].class);

        List<CartDTO> cartsByUserList = new ArrayList<>();

        for (CartDTO cart : cartsByUser) {
            cartsByUserList.add(cart);
        }

        return cartsByUserList;
    }

    public CartDTO createCart(CartDTO newCart) {
        String URL = BaseURL;

        CartDTO newCreatedCart = this.restTemplate.postForObject(URL, newCart, CartDTO.class);

        return newCreatedCart;
    }

    public CartDTO updateCart(int id, CartDTO updateCart) {
        String URL = BaseURL + String.format("/%d", id);

        CartDTO updatedCart = this.restTemplate.exchange(URL, HttpMethod.PUT, new HttpEntity<>(updateCart),
                CartDTO.class).getBody();

        return updatedCart;
    }

    public CartDTO deleteCart(int id) {
        String URL = BaseURL + String.format("/%d", id);

        CartDTO deletedCart = this.restTemplate.exchange(URL, HttpMethod.DELETE, null, CartDTO.class).getBody();

        return deletedCart;
    }
}
