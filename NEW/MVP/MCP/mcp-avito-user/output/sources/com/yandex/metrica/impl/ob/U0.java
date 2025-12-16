package com.yandex.metrica.impl.ob;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes7.dex */
public enum U0 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN);


    /* renamed from: a, reason: collision with root package name */
    private final String f379573a;

    U0(String str) {
        this.f379573a = str;
    }

    public String a() {
        return this.f379573a;
    }

    @j.N
    public static U0 a(@j.P String str) {
        U0[] u0ArrValues = values();
        for (int i12 = 0; i12 < 6; i12++) {
            U0 u02 = u0ArrValues[i12];
            if (u02.f379573a.equals(str)) {
                return u02;
            }
        }
        return UNKNOWN;
    }
}
