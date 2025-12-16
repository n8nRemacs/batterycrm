package com.hcaptcha.sdk;

import com.fasterxml.jackson.annotation.E;
import j.N;

/* loaded from: classes7.dex */
public enum HCaptchaOrientation {
    PORTRAIT("portrait"),
    /* JADX INFO: Fake field, exist only in values array */
    LANDSCAPE("landscape");


    /* renamed from: b, reason: collision with root package name */
    public final String f363085b;

    HCaptchaOrientation(String str) {
        this.f363085b = str;
    }

    @Override // java.lang.Enum
    @E
    @N
    public final String toString() {
        return this.f363085b;
    }
}
