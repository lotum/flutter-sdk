package com.usercentrics.sdk.flutter.mock

import com.usercentrics.sdk.UsercentricsServiceConsent
import com.usercentrics.sdk.flutter.api.FakeFlutterMethodCall
import com.usercentrics.sdk.models.settings.UsercentricsConsentType

internal class DenyAllMock {
    companion object {
        val fake = listOf(
            UsercentricsServiceConsent(
                templateId = "ocv9HNX_g",
                status = false,
                dataProcessor = "Facebook SDK",
                type = UsercentricsConsentType.EXPLICIT,
                version = "1.0.1"
            )
        )

        // From the debugger
        val call = FakeFlutterMethodCall(method = "denyAll", arguments = "EXPLICIT")
        val callConsentType = UsercentricsConsentType.EXPLICIT
        val expected = listOf(
            mapOf(
                "templateId" to "ocv9HNX_g",
                "status" to false,
                "type" to "EXPLICIT",
                "version" to "1.0.1",
                "dataProcessor" to "Facebook SDK",
            )
        )
    }
}