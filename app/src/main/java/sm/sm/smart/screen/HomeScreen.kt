package sm.sm.smart.screen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable

fun HomeScreen(context: Context){
    LazyColumn(Modifier.fillMaxSize(0.95f)
        , horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            for (i in 1..50){
                xet(items = "Brain = " , number = i, context = context)
            }
        }
    }

}

@Composable
fun xet(items : String , number : Int, context: Context){

    Box(modifier = Modifier
    ) {
        Row {
            zez()
            Text(text = items, modifier = Modifier.clickable {
                Toast.makeText(context,"$number", Toast.LENGTH_SHORT).show()
            }, fontSize = 30.sp)
            Text(text = number.toString(), fontSize = 30.sp)
        }

    }
}

@Composable
@Preview
fun zez(){
    Box(modifier = Modifier
        .height(70.dp)
        .width(100.dp)
        .background(Color.Yellow))

    {
//        Image(painter = painterResource() , contentDescription = "picture", modifier = Modifier
//            .clip(CircleShape))


    }

}




