package org.techtown.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_name.*
import org.techtown.lovetest.R


class NameFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {   //뷰가 만들어지고 나서 호출되는 메소드
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)                  //만들어 져으면 navigationController 선언
        btn_next.setOnClickListener {                                       //클릭 되었을 때 할 행동
            navController.navigate(R.id.action_nameFragment_to_questionFragment)   //네비게이션 이용해서 연결된 페이지로 이동

        }
    }


}