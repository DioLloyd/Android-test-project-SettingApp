package ru.diolloyd.settingapp.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.diolloyd.settingapp.SettingsActivity
import ru.diolloyd.settingapp.pages.SettingPage

@RunWith(AndroidJUnit4::class)
class SettingTests {

    @get:Rule
    val activityRule = ActivityScenarioRule(SettingsActivity::class.java)

    @Test
    fun inputTextInYourSignatureFrame() {
        SettingPage()
            .clickYourSignatureFrame()
            .inputTextInYourSignatureWindow()
    }

}