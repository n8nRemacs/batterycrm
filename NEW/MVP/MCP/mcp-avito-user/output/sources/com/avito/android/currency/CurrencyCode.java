package com.avito.android.currency;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CurrencyCode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/currency/CurrencyCode;", "", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurrencyCode {

    /* renamed from: c, reason: collision with root package name */
    public static final CurrencyCode f131082c;

    /* renamed from: d, reason: collision with root package name */
    public static final CurrencyCode f131083d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CurrencyCode[] f131084e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f131085f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f131086b;

    static {
        CurrencyCode currencyCode = new CurrencyCode("RUB", 0, "RUB");
        f131082c = currencyCode;
        CurrencyCode currencyCode2 = new CurrencyCode("UZS", 1, "UZS");
        f131083d = currencyCode2;
        CurrencyCode[] currencyCodeArr = {currencyCode, currencyCode2};
        f131084e = currencyCodeArr;
        f131085f = c.a(currencyCodeArr);
    }

    public CurrencyCode(String str, int i12, String str2) {
        this.f131086b = str2;
    }

    public static CurrencyCode valueOf(String str) {
        return (CurrencyCode) Enum.valueOf(CurrencyCode.class, str);
    }

    public static CurrencyCode[] values() {
        return (CurrencyCode[]) f131084e.clone();
    }
}
