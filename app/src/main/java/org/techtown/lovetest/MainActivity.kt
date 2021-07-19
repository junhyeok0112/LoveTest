package org.techtown.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController   //lateinit은 나중에 정해준다는 의미

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = nav_host_fragment.findNavController()       //acivity 메인에서 정해준 곳으로 바로이동 ->네비게이션 연결
        //자바에서는 findByViewId 이용해서 찾아야 했다면 코틀린에서는 그런거 없이 바로 id지정가능



    }
}