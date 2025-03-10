package com.example.m1w2d2restaurantmenuapp.ui.theme

import com.example.m1w2d2restaurantmenuapp.R
import java.net.URL

data class MenuItem(
    var id: Int,
    var name: String,
    var price: Double,
    var description: String,
    var category: String,
    var imageUrl: URL,
    var isPopular: Boolean,
    var image: Int
)
{
    companion object{
        var item_0 = MenuItem(0, "Caramel Macchiato", 4.99, "A rich espresso with vanilla-flavored milk and a caramel drizzle.",
            "coffee", URL("https://example.com/caramel-macchiato.jpg"), false, R.drawable.cutlery)

        var item_1 = MenuItem(1, "Chocolate Lava Cake",  6.49, "A warm chocolate cake with a gooey molten center, served with vanilla ice cream.",
            "dessert", URL("https://example.com/chocolate-lava-cake.jpg"), true, R.drawable.cutlery)

        var item_2 = MenuItem(2, "Classic Pancakes", 5.99, "Fluffy pancakes topped with maple syrup and butter.",
            "breakfast", URL("https://example.com/classic-pancakes.jpg"), true, R.drawable.cutlery)

        var item_3 = MenuItem(3, "Grilled Chicken", 8.99, "Fresh romaine lettuce, grilled chicken, parmesan cheese, and croutons tossed in Caesar dressing.",
            "lunch", URL("https://example.com/caesar-salad.jpg"), false, R.drawable.cutlery)

        var item_4 = MenuItem(4, "Margherita Pizza", 10.99, "A classic Italian pizza with fresh tomatoes, mozzarella, basil, and olive oil.",
            "dinner", URL("https://example.com/margherita-pizza.jpg"), false, R.drawable.cutlery)

        var item_5 = MenuItem(5, "Iced Matcha Latte", 5.49, "A refreshing blend of matcha green tea, milk, and ice.",
            "coffee", URL("https://example.com/iced-matcha-latte.jpg"), false, R.drawable.cutlery)

        var item_6 = MenuItem(5, "Spaghetti Bolognese",  12.99,  "A hearty pasta dish with a slow-cooked meat sauce, served with garlic bread.",
            "dinner", URL("https://example.com/spaghetti-bolognese.jpg"), true, R.drawable.cutlery)


    }
}
