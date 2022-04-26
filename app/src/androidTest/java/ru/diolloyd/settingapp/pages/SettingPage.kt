package ru.diolloyd.settingapp.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.core.StringContains.containsString

class SettingPage {

    fun clickYourSignatureFrame(): SettingPage {
        onView(withChild(withText("Your signature"))).perform(click())
        return this
    }

    fun inputTextInYourSignatureWindow(text: String): SettingPage {
        onView(withClassName(containsString("AppCompatEditText"))).perform(typeText(text))
        return this
    }

    fun clickOkInYourSignatureWindow(): SettingPage {
        onView(withId(android.R.id.button1)).perform(click())
        return this
    }

    fun checkTextYourSignatureFrame(text: String): SettingPage {
        onView(withText(containsString(text))).check(matches(isDisplayed()))
        return this
    }

    fun clickDefaultReplyAction(): SettingPage {
        onView(withText(containsString("Default reply action"))).perform(click())
        return this
    }

    fun choiceDefaultReplyAction(action: String): SettingPage {
        onView(withText(containsString(action))).perform(click())
        return this
    }

    fun checkDefaultReplyAction(text: String): SettingPage {
        onView(withText(containsString(text))).check(matches(isDisplayed()))
        return this
    }

    fun switchSyncEmailPeriodically(): SettingPage {
        onView(withText(containsString("Sync email periodically"))).perform(click())
        return this
    }

}