package com.sm2k4.carty.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sm2k4.carty.DTOs.CartDTO;
import com.sm2k4.carty.Services.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("")
    public ResponseEntity<List<CartDTO>> getAllCarts() {
        List<CartDTO> allCarts = this.cartService.getAllCarts();

        return ResponseEntity.ok(allCarts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartDTO> getCartById(@PathVariable int id) {
        CartDTO cartById = this.cartService.getCartById(id);

        return ResponseEntity.ok(cartById);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<CartDTO>> getCartsFilterByDate(@RequestParam("startdate") String startdate,
            @RequestParam("enddate") String enddate) {

        List<CartDTO> cartsFilteredByDate = this.cartService.getCartsFilterByDate(startdate, enddate);

        return ResponseEntity.ok(cartsFilteredByDate);

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<CartDTO>> getCartsByUserId(@PathVariable int id) {

        List<CartDTO> cartsByUser = this.cartService.getCartsByUserId(id);

        return ResponseEntity.ok(cartsByUser);
    }

    @PostMapping("")
    public ResponseEntity<CartDTO> createCart(@RequestBody CartDTO newCart) {
        CartDTO createdCart = this.cartService.createCart(newCart);

        return ResponseEntity.ok(createdCart);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CartDTO> updateCart(@PathVariable int id, @RequestBody CartDTO updateCart) {
        CartDTO updatedCart = this.cartService.updateCart(id, updateCart);

        return ResponseEntity.ok(updatedCart);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CartDTO> deleteCart(@PathVariable int id) {

        CartDTO deletedCart = this.cartService.deleteCart(id);

        return ResponseEntity.ok(deletedCart);
    }

}
