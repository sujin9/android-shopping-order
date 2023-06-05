package woowacourse.shopping.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CartProductDto(
    val id: Int,
    val quantity: Int,
    val product: ProductDto,
)
