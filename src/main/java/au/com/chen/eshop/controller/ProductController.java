package au.com.chen.eshop.controller;

import au.com.chen.eshop.model.Product;
import au.com.chen.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;


    @RequestMapping("/hello")
    public String home() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        Iterable<Product> products = this.productService.findAll();
        model.addAttribute("products", products);

        return "list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createGet(Model model) {

        model.addAttribute("product", new Product());

        return "create";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String createPost(Model model, @ModelAttribute("product") Product product) {

        product = this.productService.save(product);
        model.addAttribute("product", product);

        return "redirect:/products/" + product.getId();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String read(Model model, @PathVariable("id") Long id) {

        Product product = this.productService.findOne(id);
        model.addAttribute("product", product);

        return "read";
    }


    @RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
    public String updateGet(Model model, @PathVariable("id") Long id) {

        Product product = this.productService.findOne(id);
        model.addAttribute("product", product);

        return "update";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updatePut(Model model, @ModelAttribute("product") Product product) {

        this.productService.save(product);
        return "redirect:/products/" + product.getId();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {

        this.productService.delete(id);
        return "redirect:/products";
    }
}
