package com.menesdurak.e_ticaret_uygulamasi.data.mapper

import com.menesdurak.e_ticaret_uygulamasi.common.mapper.ListMapper
import com.menesdurak.e_ticaret_uygulamasi.data.local.entity.BoughtProduct
import com.menesdurak.e_ticaret_uygulamasi.data.local.entity.CartProduct

class CartProductListToBoughtProductListMapper: ListMapper<CartProduct, BoughtProduct> {
    override fun map(input: List<CartProduct>): List<BoughtProduct> {
        return input.map {
            BoughtProduct(
                category = it.category,
                description = it.description,
                id = it.id,
                image = it.image,
                price = it.price,
                title = it.title,
                amount = it.amount,
                isDelivered = false
            )
        }
    }
}