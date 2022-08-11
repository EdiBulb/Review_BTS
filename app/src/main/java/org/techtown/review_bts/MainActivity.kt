package org.techtown.review_bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭되었다는 것을 알아야한다.(프로그램이)
        //이미지의 id를 통해서 이미지를 변수에 넣고 이 이미지가 클릭되었을 때, 어떤 기능을 할 것인가 로직을 짠다.
        val image1 = findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener {
            //토스트 메시지를 띄워준다.
            Toast.makeText(this,"1번 클릭 완료", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여준다.
            //인텐트를통해 화면전환을 할 것 이다.
            //인텐트를 써서 다음 화면으로 이동하는 기능을 intent 변수에 넣는다.
            val intent = Intent(this,Bts1Activity::class.java)

            //그리고 그 변수를 실행시킨다.
            startActivity(intent)
        }
        /*각각의 이미지뷰의 id를 받아와서 변수에 넣어준다.*/
        val image2 = findViewById<ImageView>(R.id.btsImage2)
        val image3 = findViewById<ImageView>(R.id.btsImage3)
        val image4 = findViewById<ImageView>(R.id.btsImage4)
        val image5 = findViewById<ImageView>(R.id.btsImage5)
        val image6 = findViewById<ImageView>(R.id.btsImage6)
        val image7 = findViewById<ImageView>(R.id.btsImage7)

        /*그리고 각각의 이미지가 눌렸을 때 일어나는 것 로직 짜기*/
        image2.setOnClickListener {
            val intent = Intent(this,Bts2Activity::class.java)
            startActivity(intent)

        }
        image3.setOnClickListener {
            val intent = Intent(this,Bts3Activity::class.java)
            startActivity(intent)

        }
        image4.setOnClickListener {
            val intent = Intent(this,Bts4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            val intent = Intent(this,Bts5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            val intent = Intent(this,Bts6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            val intent = Intent(this,Bts7Activity::class.java)
            startActivity(intent)
        }
    }
}