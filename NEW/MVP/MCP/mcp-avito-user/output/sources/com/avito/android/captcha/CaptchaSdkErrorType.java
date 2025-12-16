package com.avito.android.captcha;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CaptchaError.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/CaptchaSdkErrorType;", "", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CaptchaSdkErrorType {

    /* renamed from: b, reason: collision with root package name */
    public static final CaptchaSdkErrorType f114929b;

    /* renamed from: c, reason: collision with root package name */
    public static final CaptchaSdkErrorType f114930c;

    /* renamed from: d, reason: collision with root package name */
    public static final CaptchaSdkErrorType f114931d;

    /* renamed from: e, reason: collision with root package name */
    public static final CaptchaSdkErrorType f114932e;

    /* renamed from: f, reason: collision with root package name */
    public static final CaptchaSdkErrorType f114933f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CaptchaSdkErrorType[] f114934g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114935h;

    static {
        CaptchaSdkErrorType captchaSdkErrorType = new CaptchaSdkErrorType("SESSION_TIMEOUT", 0);
        f114929b = captchaSdkErrorType;
        CaptchaSdkErrorType captchaSdkErrorType2 = new CaptchaSdkErrorType("TOKEN_TIMEOUT", 1);
        f114930c = captchaSdkErrorType2;
        CaptchaSdkErrorType captchaSdkErrorType3 = new CaptchaSdkErrorType("CLOSED", 2);
        f114931d = captchaSdkErrorType3;
        CaptchaSdkErrorType captchaSdkErrorType4 = new CaptchaSdkErrorType("NETWORK_ERROR", 3);
        f114932e = captchaSdkErrorType4;
        CaptchaSdkErrorType captchaSdkErrorType5 = new CaptchaSdkErrorType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        f114933f = captchaSdkErrorType5;
        CaptchaSdkErrorType[] captchaSdkErrorTypeArr = {captchaSdkErrorType, captchaSdkErrorType2, captchaSdkErrorType3, captchaSdkErrorType4, captchaSdkErrorType5};
        f114934g = captchaSdkErrorTypeArr;
        f114935h = kotlin.enums.c.a(captchaSdkErrorTypeArr);
    }

    public CaptchaSdkErrorType() {
        throw null;
    }

    public static CaptchaSdkErrorType valueOf(String str) {
        return (CaptchaSdkErrorType) Enum.valueOf(CaptchaSdkErrorType.class, str);
    }

    public static CaptchaSdkErrorType[] values() {
        return (CaptchaSdkErrorType[]) f114934g.clone();
    }
}
