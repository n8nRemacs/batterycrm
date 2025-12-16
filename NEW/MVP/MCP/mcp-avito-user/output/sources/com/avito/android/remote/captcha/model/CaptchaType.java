package com.avito.android.remote.captcha.model;

import Y61.k;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CaptchaData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/captcha/model/CaptchaType;", "", "<init>", "(Ljava/lang/String;I)V", "H_CAPTCHA", "AVITO_CAPTCHA", "GEETEST", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CaptchaType {

    @c("avitoCaptcha")
    public static final CaptchaType AVITO_CAPTCHA;

    @c("geeTest")
    public static final CaptchaType GEETEST;

    @c("hCaptcha")
    public static final CaptchaType H_CAPTCHA;

    /* renamed from: b, reason: collision with root package name */
    @com.avito.android.gson.c
    public static final CaptchaType f253318b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CaptchaType[] f253319c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253320d;

    /* compiled from: CaptchaData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f253321a;

        static {
            int[] iArr = new int[CaptchaType.values().length];
            try {
                iArr[CaptchaType.H_CAPTCHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptchaType.AVITO_CAPTCHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CaptchaType.GEETEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CaptchaType.f253318b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f253321a = iArr;
        }
    }

    static {
        CaptchaType captchaType = new CaptchaType("H_CAPTCHA", 0);
        H_CAPTCHA = captchaType;
        CaptchaType captchaType2 = new CaptchaType("AVITO_CAPTCHA", 1);
        AVITO_CAPTCHA = captchaType2;
        CaptchaType captchaType3 = new CaptchaType("GEETEST", 2);
        GEETEST = captchaType3;
        CaptchaType captchaType4 = new CaptchaType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        f253318b = captchaType4;
        CaptchaType[] captchaTypeArr = {captchaType, captchaType2, captchaType3, captchaType4};
        f253319c = captchaTypeArr;
        f253320d = kotlin.enums.c.a(captchaTypeArr);
    }

    private CaptchaType(String str, int i12) {
    }

    public static CaptchaType valueOf(String str) {
        return (CaptchaType) Enum.valueOf(CaptchaType.class, str);
    }

    public static CaptchaType[] values() {
        return (CaptchaType[]) f253319c.clone();
    }

    public final boolean a() {
        int i12 = a.f253321a[ordinal()];
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            return true;
        }
        if (i12 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        int i12 = a.f253321a[ordinal()];
        if (i12 == 1) {
            return "hCaptcha";
        }
        if (i12 == 2) {
            return "avitoCaptcha";
        }
        if (i12 == 3) {
            return "geeTest";
        }
        if (i12 == 4) {
            return "null";
        }
        throw new NoWhenBranchMatchedException();
    }
}
