package kim.hsl.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 获取布局组件
        textView = findViewById(R.id.textView)

        // 获取 ViewModel
        myViewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory(application))
            .get(MyViewModel::class.java)

        // 组件中显示 ViewModel 中的内容
        textView.setText("${myViewModel.number}")
    }

    fun onClick(view: View) {
        myViewModel.number++
        textView.setText("${myViewModel.number}")
    }
}