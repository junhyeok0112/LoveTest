package org.techtown.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_result.*
import org.techtown.lovetest.R


class ResultFragment : Fragment() {

    var option : Int = -1 ;       //번들로 넘어온 index 잡을 변수
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?: -1  //넘어온 index를 Int로 잡는다 -> 매개변수가 넘어와서 argument
        // ?: -1 은 결과 전체가 null이면 -1 반환 하라는 뜻
        return inflater.inflate(R.layout.fragment_result, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        btn_home.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_nameFragment)
        }
        setResult(option)
    }

    fun setResult(option : Int){
        when(option){
            1->{
                tv_main.text = "버린다"       //tv_main.setText 와 동일한 효과
                tv_sub.text = "포기하지마"
            }
            2->{
                tv_main.text = "물을 준다"       //tv_main.setText 와 동일한 효과
                tv_sub.text = "포기하지마2"}
            3->{
                tv_main.text = "일부 자른다"       //tv_main.setText 와 동일한 효과
                tv_sub.text = "포기하지마3"
            }
            4->{
                tv_main.text = "말린다"       //tv_main.setText 와 동일한 효과
                tv_sub.text = "포기하지마4"
            }
        }
    }

}