package com.example.listgrid

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listgrid.R
import com.example.listgrid.ui.theme.ListGridTheme
import com.example.listgrid.ui.theme.ListGridTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListGridTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        TopAppBar(
                            backgroundColor = MaterialTheme.colors.primary,
                            title={Text(text = "Seme Students Photo Gallery")}
                        )
                    }
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        Gallery()
                    }
                }
            }
        }
    }
}

@Composable
fun Gallery() {
    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Image(
                    painter = painterResource(R.drawable.image1),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Session One",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image2),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Session Two",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image3),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Session Three",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image4),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Session Four",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image5),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Session Five",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image6),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Session Six",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image7),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Session Seven",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            item {
                Image(
                    painter = painterResource(R.drawable.image8),
                    contentDescription = "Images",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop,


                )
                Text(
                    text = "Session Nine",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListGridTheme {
        Gallery()
    }
}