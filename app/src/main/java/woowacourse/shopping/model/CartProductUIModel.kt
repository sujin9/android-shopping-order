package woowacourse.shopping.model

import java.io.Serializable

data class CartProductUIModel(
    val id: Int,
    val name: String,
    val count: Int,
    val checked: Boolean,
    val price: Int,
    val imageUrl: String,
    val productId: Int,
) : Serializable {
    fun toProduct() = Product(
        id = productId,
        name = name,
        price = price,
        imageUrl = imageUrl,
    )
}
