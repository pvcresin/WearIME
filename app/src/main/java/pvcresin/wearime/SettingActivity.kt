package pvcresin.wearime

import android.app.Activity
import android.os.Bundle


class SettingActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.setting_view)
    }

    public override fun onDestroy() {
        super.onDestroy()
    }

}