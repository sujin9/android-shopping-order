package woowacourse.shopping.ui.shopping

import woowacourse.shopping.uimodel.ProductUIModel
import woowacourse.shopping.uimodel.RecentProductUIModel

interface ShoppingContract {
    interface View {
        fun addMoreProducts(products: List<ProductUIModel>)
        fun setRecentProducts(recentProductsData: List<RecentProductUIModel>)
        fun setCartProducts(cartCounts: Map<Int, Int>)
        fun setToolbar(totalCount: Int)
        fun navigateToProductDetail(product: ProductUIModel)
    }

    interface Presenter {
        fun setUpProducts()
        fun setUpNextProducts()
        fun setUpRecentProducts()
        fun setUpCartCounts()
        fun setUpTotalCount()
        fun updateItemCount(productId: Int, count: Int)
        fun navigateToItemDetail(productId: Int)
    }
}
