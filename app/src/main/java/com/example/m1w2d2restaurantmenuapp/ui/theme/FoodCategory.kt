package com.example.m1w2d2restaurantmenuapp.ui.theme

import com.example.m1w2d2restaurantmenuapp.R
import java.net.URL

data class FoodCategory(
    var id: Int,
    var name: String,
    var description: String,
    var imageUrl: URL,
    var iconFile: Int
) {
    companion object {

        var catg_0 = FoodCategory(0, "Dinner",
            "Dinner usually refers to what is in many Western cultures the biggest and most formal meal of the day. ",
            URL("https://www.google.com/imgres?q=Dinnermeal&imgurl=https%3A%2F%2Fwww.recipetineats.com%2Ftachyon%2F2020%2F03%2FOne-Pot-Chicken-Shawarma-and-Rice_original-3.jpg&imgrefurl=https%3A%2F%2Fwww.recipetineats.com%2Frice-recipes-rice-meals-for-dinner%2F&docid=LYuo9f_Ht2DM2M&tbnid=El2JM9U1TUwCFM&vet=12ahUKEwi9j6uAtv-LAxXdB9sEHaBmNTc4ChAzegQIJhAA..i&w=900&h=1125&hcb=2&ved=2ahUKEwi9j6uAtv-LAxXdB9sEHaBmNTc4ChAzegQIJhAA"),
            R.drawable.burger
        )

        var catg_1 = FoodCategory(1, "Dessert",
            "consist of pastry, cake, ice cream, pudding, or fresh or cooked fruit",
            URL("https://www.foodandwine.com/thmb/byVZsChjc0hG9nU0CiUeESKZvxg=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/Angel-Food-Cake-with-Three-Berry-Compote-FT-RECIPE0323-541a780b871441e0ab14383ee38acc44.jpg"),
            R.drawable.piece_of_cake
            )

        var catg_2 = FoodCategory(2, "Coffee",
            "Enjoy one of our light, medium, dark, decaffeinated, or flavored brews of the day, brewed from only the top 1% of Arabica beans in the world.",
            URL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fcoffeebean.com.au%2Fblogs%2Farticles%2Farticle-coming-soon&psig=AOvVaw1p0-xt1brLJIindcOqqrIM&ust=1741691276291000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCLiZ_uqv_4sDFQAAAAAdAAAAABAE"),
            R.drawable.coffee_cup)


        var catg_3 = FoodCategory(3, "Breakfast",
            "Breakfast is often called 'the most important meal of the day', and for good reason. As the name suggests, breakfast breaks the overnight fasting period.",
            URL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.licious.in%2Fblog%2Fdelicious-recipes%2Flicious-breakfast-meat&psig=AOvVaw0q7b_imj0I9cV08dy26OQI&ust=1741691501536000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCKDyotOw_4sDFQAAAAAdAAAAABAE"),
            R.drawable.healthy_drink
            )


        var catg_4 = FoodCategory(4, "Lunch",
            "Lunch is a meal eaten around the middle of the day. It is commonly the second meal of the day, after breakfast, but before dinner",
            URL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.istockphoto.com%2Fphotos%2Flunch-food&psig=AOvVaw1yHcoWy_JA2Zd6_KZ4v0pA&ust=1741692685735000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPDMkZi1_4sDFQAAAAAdAAAAABAE"),
            R.drawable.biryani)

    }
}