package com.hcaptcha.sdk;

import j.N;

/* loaded from: classes7.dex */
public enum HCaptchaError {
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(7, "No internet connection"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_DATA(8, "Invalid data is not accepted by endpoints"),
    /* JADX INFO: Fake field, exist only in values array */
    CHALLENGE_ERROR(9, "Challenge encountered error on setup"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL_ERROR(10, "hCaptcha client encountered an internal error"),
    SESSION_TIMEOUT(15, "Session Timeout"),
    TOKEN_TIMEOUT(16, "Token Timeout"),
    CHALLENGE_CLOSED(30, "Challenge Closed"),
    /* JADX INFO: Fake field, exist only in values array */
    RATE_LIMITED(31, "Rate Limited"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CUSTOM_THEME(32, "Invalid custom theme"),
    ERROR(29, "Unknown error");


    /* renamed from: b, reason: collision with root package name */
    public final int f363080b;

    /* renamed from: c, reason: collision with root package name */
    public final String f363081c;

    HCaptchaError(int i12, String str) {
        this.f363080b = i12;
        this.f363081c = str;
    }

    @Override // java.lang.Enum
    @N
    public final String toString() {
        return this.f363081c;
    }
}
