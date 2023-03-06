package kim.hsl.viewmodeldemo

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MyViewModel2 : AndroidViewModel {
    constructor(application: Application) : super(application) {
        // 此处可获取 Application 上下文对象
    }
}