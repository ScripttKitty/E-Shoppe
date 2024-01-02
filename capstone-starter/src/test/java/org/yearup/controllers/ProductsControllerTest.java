package org.yearup.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.yearup.data.ProductDao;
import org.yearup.models.Product;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class ProductsControllerTest {

    @Mock
    private ProductDao productDao;

    @InjectMocks
    private ProductsController productsController;

    private MockMvc mockMvc;

    @Test
    void search() throws Exception {
        // Mock data for testing
        List<Product> mockProducts = Arrays.asList(
                new Product(1, "Product1", BigDecimal.valueOf(20.0), 1, "Description1", "Red", 10, true, "imageUrl1"),
                new Product(2, "Product2", BigDecimal.valueOf(30.0), 1, "Description2", "Blue", 15, false, "imageUrl2")
        );

        // Mock the behavior of the productDao.search method
        Mockito.when(productDao.search(Mockito.any(), Mockito.any(), Mockito.any(), Mockito.any()))
                .thenReturn(mockProducts);

        // Standalone setup for the controller
        mockMvc = MockMvcBuilders.standaloneSetup(productsController).build();

        // Perform the GET request with parameters and assert the results
        mockMvc.perform(MockMvcRequestBuilders.get("/products")
                        .param("cat", "1")
                        .param("minPrice", "10.0")
                        .param("maxPrice", "40.0")
                        .param("color", "Red")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Product1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name").value("Product2"));
    }
}