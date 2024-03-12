package org.example.cart_service.Controllers;

import org.example.cart_service.Category.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
@GetMapping("/getallCategories")
    public String[] get_all_Categories(){
        Category a =new Category();

        String [] cats  = {a.cat1 ,
                a.cat2,
                a.cat3,
                a.cat4,
                a.cat5};
        return cats;
    }
}
