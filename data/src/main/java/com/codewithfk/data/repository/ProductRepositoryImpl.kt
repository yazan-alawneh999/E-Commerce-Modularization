package com.codewithfk.data.repository

import com.codewithfk.domain.model.Product
import com.codewithfk.domain.model.ProductListModel
import com.codewithfk.domain.network.NetworkService
import com.codewithfk.domain.network.ResultWrapper
import com.codewithfk.domain.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService) : ProductRepository {
    override suspend fun getProducts(category: Int?): ResultWrapper<ProductListModel> {
        return networkService.getProducts(category)
    }
}