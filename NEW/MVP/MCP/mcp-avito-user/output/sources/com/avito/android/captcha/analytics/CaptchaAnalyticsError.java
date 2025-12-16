package com.avito.android.captcha.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CaptchaAnalyticsError.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/analytics/CaptchaAnalyticsError;", "", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CaptchaAnalyticsError {

    /* renamed from: c, reason: collision with root package name */
    public static final CaptchaAnalyticsError f114957c;

    /* renamed from: d, reason: collision with root package name */
    public static final CaptchaAnalyticsError f114958d;

    /* renamed from: e, reason: collision with root package name */
    public static final CaptchaAnalyticsError f114959e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CaptchaAnalyticsError[] f114960f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114961g;

    /* renamed from: b, reason: collision with root package name */
    public final int f114962b;

    static {
        CaptchaAnalyticsError captchaAnalyticsError = new CaptchaAnalyticsError("EXPIRED_CAPTCHA_ERROR", 0, 2);
        f114957c = captchaAnalyticsError;
        CaptchaAnalyticsError captchaAnalyticsError2 = new CaptchaAnalyticsError("CLOSED_CAPTCHA_ERROR", 1, 1);
        f114958d = captchaAnalyticsError2;
        CaptchaAnalyticsError captchaAnalyticsError3 = new CaptchaAnalyticsError("INTERNAL_CAPTCHA_ERROR", 2, 0);
        f114959e = captchaAnalyticsError3;
        CaptchaAnalyticsError[] captchaAnalyticsErrorArr = {captchaAnalyticsError, captchaAnalyticsError2, captchaAnalyticsError3, new CaptchaAnalyticsError("OTHER_CLIENT_ERROR", 3, -1)};
        f114960f = captchaAnalyticsErrorArr;
        f114961g = kotlin.enums.c.a(captchaAnalyticsErrorArr);
    }

    public CaptchaAnalyticsError(String str, int i12, int i13) {
        this.f114962b = i13;
    }

    public static CaptchaAnalyticsError valueOf(String str) {
        return (CaptchaAnalyticsError) Enum.valueOf(CaptchaAnalyticsError.class, str);
    }

    public static CaptchaAnalyticsError[] values() {
        return (CaptchaAnalyticsError[]) f114960f.clone();
    }
}
