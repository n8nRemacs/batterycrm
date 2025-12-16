package com.yandex.mobile.ads.impl;

import com.my.tracker.ads.AdFormat;

/* loaded from: classes8.dex */
public enum y6 {
    f391935b(AdFormat.BANNER),
    f391936c(AdFormat.INTERSTITIAL),
    f391937d(AdFormat.REWARDED),
    f391938e("native"),
    f391939f("vastvideo"),
    f391940g("instream"),
    f391941h("appopenad");


    /* renamed from: a, reason: collision with root package name */
    private final String f391943a;

    y6(String str) {
        this.f391943a = str;
    }

    public final String a() {
        return this.f391943a;
    }

    public static y6 a(String str) {
        for (y6 y6Var : values()) {
            if (y6Var.f391943a.equals(str)) {
                return y6Var;
            }
        }
        return null;
    }
}
