package com.example.yourpackage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.staticphotogallery.R

@Composable
fun PhotoItem( //from 4o
    imageRes: Int,
    caption: String
) {
    // Use Column to range the picture
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    ){
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = caption,
            modifier = Modifier
                .width(160.dp)
                .height(160.dp))
        Spacer(modifier = Modifier.height(8.dp)) // 图片和文字之间的空隙
        Text(
            text = caption,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}


@Composable

fun PhotoGalleryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        // Header
        Text(
            text = "Kane's Photo Gallery",
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black
        )
        //Divider
        Divider(
            color = Color.Gray,
            thickness = 2.dp,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        // Use Grid (Generate by ChatGPT4o)
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                PhotoItem(R.drawable.photo_1, "Edinburgh 24.1.6")
                PhotoItem(R.drawable.photo_2, "Boston 24.2.4")
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                PhotoItem(R.drawable.photo_3, "San Francisco 24.3.14")
                PhotoItem(R.drawable.photo_4, "XinJiang 24.8.5")
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                PhotoItem(R.drawable.photo_5, "Orlando 24.12.22")
                PhotoItem(R.drawable.photo_6, "Los Angeles 24.12.28")
            
        }
    }
}
}