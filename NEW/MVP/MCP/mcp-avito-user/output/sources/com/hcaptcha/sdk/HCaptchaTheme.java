package com.hcaptcha.sdk;

import com.avito.android.remote.model.text.FontStyleKt;
import com.fasterxml.jackson.annotation.E;
import j.N;

/* loaded from: classes7.dex */
public enum HCaptchaTheme {
    /* JADX INFO: Fake field, exist only in values array */
    DARK("dark"),
    LIGHT(FontStyleKt.LIGHT),
    /* JADX INFO: Fake field, exist only in values array */
    CONTRAST("contrast");


    /* renamed from: b, reason: collision with root package name */
    public final String f363091b;

    HCaptchaTheme(String str) {
        this.f363091b = str;
    }

    @Override // java.lang.Enum
    @E
    @N
    public final String toString() {
        return this.f363091b;
    }
}
