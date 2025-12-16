package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes8.dex */
public final class qp1 {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static qp1 f389279b = new qp1();

    /* renamed from: a, reason: collision with root package name */
    private Context f389280a;

    private qp1() {
    }

    public static qp1 a() {
        return f389279b;
    }

    public final Context b() {
        return this.f389280a;
    }

    public final void a(Context context) {
        this.f389280a = context != null ? context.getApplicationContext() : null;
    }
}
