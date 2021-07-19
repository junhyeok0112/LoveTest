package org.techtown.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_question.*
import org.techtown.lovetest.R
class QuestionFragment : Fragment(), View.OnClickListener { //onClickListener를 인터페이스로 받아서 구현 , 인터페이스는 몇개든 가능

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)                  //view는 현재 해당 view의미
        btn_next2.setOnClickListener(this)                                  //this면 class파일에서 구현된 onClick 적용
    }

    override fun onClick(v: View?) {    //어떤 view를 클릭했을 때 V가 이벤트로 넘어옴 ->즉 id 지정해주면됨
        when(v?.id){                    //이런식으로 버튼 여러개일때 모두 커버가능 ->이 방법은 인터페이스 직접 구현하는방법
            R.id.btn_next2->{
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }
}