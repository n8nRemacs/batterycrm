package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final cq f383627a = new cq();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ba0 f383628b = new ba0();

    @j.P
    public static String a() {
        return Build.MANUFACTURER;
    }

    @j.P
    public final String b(@j.N Context context) {
        return this.f383628b.a(context);
    }

    @j.P
    public final String a(@j.N Context context) {
        return bq.a(this.f383627a.a(context)).toLowerCase(Locale.US);
    }
}
