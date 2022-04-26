package ru.diolloyd.settingapp.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.core.StringContains.containsString

class SettingPage {

    fun clickYourSignatureFrame(): SettingPage {
        onView(withChild(withText("Your signature"))).perform(click())
        return this
    }

    fun inputTextInYourSignatureWindow(): SettingPage {
        onView(withClassName(containsString("AppCompatEditText"))).perform(typeText("ololo"))
        return this
    }

    fun clickOkInYourSignatureWindow(): SettingPage {
        onView(withId(android.R.id.button1)).perform(click())
        return this
    }

    fun checkTextYourSignatureFrame(): SettingPage {
        onView(withChild(withText("Your signature"))).perform(click())
        return this
    }

}