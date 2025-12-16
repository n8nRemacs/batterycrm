package com.hcaptcha.sdk;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.annotation.E;
import j.N;

/* loaded from: classes7.dex */
public enum HCaptchaSize {
    INVISIBLE("invisible"),
    /* JADX INFO: Fake field, exist only in values array */
    NORMAL(Constants.NORMAL),
    /* JADX INFO: Fake field, exist only in values array */
    COMPACT("compact");


    /* renamed from: b, reason: collision with root package name */
    public final String f363088b;

    HCaptchaSize(String str) {
        this.f363088b = str;
    }

    @Override // java.lang.Enum
    @E
    @N
    public final String toString() {
        return this.f363088b;
    }
}
