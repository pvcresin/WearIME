package pvcresin.wearime

import android.inputmethodservice.InputMethodService
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.util.Xml
import android.view.KeyEvent
import android.view.View


open class WearIME : InputMethodService(), KeyboardView.OnKeyboardActionListener {

    //初回だけ呼ばれる
//    override fun onCreate() {
//        super.onCreate()
//    }

    //初回だけ呼ばれる
    override fun onCreateInputView(): View {
        super.onCreateInputView()

        val keyboardView = KeyboardView(this,
                Xml.asAttributeSet(resources.getLayout(R.layout.keyboard_view)))

        val keyboard = Keyboard(this, R.layout.keyboard)
        keyboardView.setOnKeyboardActionListener(this)
        keyboardView.isPreviewEnabled = false
        keyboardView.keyboard = keyboard
        return keyboardView
    }

    //キーボードが表示されるたびに呼ばれるメソッド
//    override fun onStartInputView(editorInfo: EditorInfo, restarting: Boolean) {
//        //なんらかの処理
//    }

    //キーボードが閉じる時に呼ばれるメソッド
//    override fun onDestroy() {
//        super.onDestroy()
//    }

    //キーを押した時
    override fun onKey(primaryCode: Int, keyCodes: IntArray) {
        val ic = currentInputConnection

        when (primaryCode) {
            KeyEvent.KEYCODE_1 -> ic.commitText("1", 1)
            KeyEvent.KEYCODE_2 -> ic.commitText("2", 1)
            KeyEvent.KEYCODE_3 -> ic.commitText("3", 1)
            KeyEvent.KEYCODE_4 -> ic.commitText("4", 1)
            KeyEvent.KEYCODE_5 -> ic.commitText("5", 1)
            KeyEvent.KEYCODE_6 -> ic.commitText("6", 1)
            KeyEvent.KEYCODE_7 -> ic.commitText("7", 1)
            KeyEvent.KEYCODE_8 -> ic.commitText("8", 1)
            KeyEvent.KEYCODE_9 -> ic.commitText("9", 1)
            KeyEvent.KEYCODE_0 -> ic.commitText("0", 1)
            Keyboard.KEYCODE_DELETE -> ic.deleteSurroundingText(1, 0)
            KeyEvent.KEYCODE_ENTER -> ic.sendKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER))
            else -> {}
        }

    }

    override fun onPress(primaryCode: Int) {}

    override fun onRelease(primaryCode: Int) {}

    override fun onText(text: CharSequence) {}

    override fun swipeLeft() {}

    override fun swipeRight() {}

    override fun swipeDown() {}

    override fun swipeUp() {}

}