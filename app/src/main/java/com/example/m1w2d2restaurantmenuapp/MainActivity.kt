package com.example.m1w2d2restaurantmenuapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.m1w2d2restaurantmenuapp.ui.theme.FoodCategory
import com.example.m1w2d2restaurantmenuapp.ui.theme.M1W2D2RestaurantMenuAppTheme
import com.example.m1w2d2restaurantmenuapp.ui.theme.MenuItem
import java.util.Locale.Category
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            M1W2D2RestaurantMenuAppTheme {
                //List of the categories that we have
                val catgs: List<FoodCategory> = listOf(
                    FoodCategory.catg_0,
                    FoodCategory.catg_1,
                    FoodCategory.catg_2,
                    FoodCategory.catg_3,
                    FoodCategory.catg_4,
                )
                //List of the items that we have
                val items: List<MenuItem> = listOf(
                    MenuItem.item_0,
                    MenuItem.item_1,
                    MenuItem.item_2,
                    MenuItem.item_3,
                    MenuItem.item_4,
                    MenuItem.item_5,
                    MenuItem.item_6,
                )

//                CategoryUI(Modifier,
//                    catgs = catgs
//                )

                RestaurantPage(
                    Modifier,
                    catgs = catgs,
                    items = items
                )

//                ItemUI(items[0])
            }
        }
    }

    @Composable
    fun RestaurantPage(
        modifier: Modifier = Modifier, catgs: List<FoodCategory>, items: List<MenuItem>
    ) {
        Column(
            modifier.fillMaxSize()
                .padding(0.dp, 16.dp, 0.dp, 16.dp)
        ) {
            //Horizontal Categories List
            LazyRow(
                modifier = Modifier,
                contentPadding = PaddingValues(16.dp)
            ) {
                items(items = catgs) { catg ->
                    CategoryUI(modifier = Modifier, catg)
                }
            }

            Spacer(Modifier.height(24.dp))

            //Vertical Menu Items List
            LazyColumn (modifier = Modifier,
                contentPadding = PaddingValues(16.dp)
            ) {
                items(items = items) { item ->
                    ItemUI(item)
                }
            }
        }
    }

    @Composable
    fun CategoryUI(
        modifier: Modifier,
        catg: FoodCategory
    ) {
        Card(
            modifier = Modifier.padding(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // category icon
                Icon(
                    painter = painterResource(id = catg.iconFile),
                    contentDescription = "icon",
                    modifier = Modifier.width(64.dp),
                )
                Spacer(Modifier.height(8.dp))
                // category name
                Text(
                    text = catg.name,
                    fontSize = 16.sp,
                )
            }
        }
    }
}

@Composable
fun ItemUI(item: MenuItem){
    Card(
        modifier = Modifier.padding(8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray)
    ){
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp)
        ){
            //it tok so long, it didn't worked until 11:58pm  :(
            BadgedBox(
                badge = {
                    if (item.isPopular){
                        Badge(
                            containerColor = Color.Green,
                            contentColor = Color.DarkGray,
                            modifier = Modifier
                                .width(50.dp)
                                .height(16.dp)
                                .align(Alignment.BottomEnd), //Trying to change the badge location, but it does not work !!

                        ){
                            Text(text = "Popular", modifier = Modifier)
                        }
                    }
                }
            )
            {
                //Item Image
                Image(
                    painter = painterResource(item.image),//(item.imageUrl)
                    contentDescription = "image",
                    modifier = Modifier
                        .width(100.dp)
                )
            }
            Spacer(Modifier.width(4.dp))
            //Column for item info
            Column (modifier = Modifier.fillMaxWidth()) {

                //A row for item name and price
                Row(
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = item.name, fontSize = 19.sp, color = Color.Black)
                    Spacer(Modifier.width(16.dp))
                    Text(text = item.price.toString(), fontSize = 19.sp, color = Color.Black, textAlign= TextAlign.End)
                }
                //Item description
                Text(text = item.description, fontSize = 12.sp, color = Color.Black)
            }
        }
    }
}
