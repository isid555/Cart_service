package org.example.cart_service.Controllers;

import org.example.cart_service.Product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/getsing")
    public int get_single_cart(){

        return 10;

    }



}
