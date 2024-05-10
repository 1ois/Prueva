package com.example.seccion5.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.seccion5.R
@Preview(showBackground = true)
@Composable
fun ImagenesView(){
Box(contentAlignment = Alignment.Center ,modifier= Modifier.fillMaxSize()){
    Column {
        Image(painter= painterResource(id = R.drawable.descarga),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(4.dp, MaterialTheme.colorScheme.onPrimaryContainer, CircleShape))
        AsyncImage(model = "https://static.vecteezy.com/system/resources/previews/019/054/996/original/cute-anime-girl-in-black-hoodie-and-green-eyes-vector.jpg", contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(20.dp))
                .border(
                    4.dp, MaterialTheme.colorScheme.onPrimaryContainer,
                    RoundedCornerShape(20.dp)
                )
        )
    }


}
}