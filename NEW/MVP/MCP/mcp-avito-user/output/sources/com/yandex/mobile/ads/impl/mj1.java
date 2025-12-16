package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class mj1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final SharedPreferences f388012a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final kj1 f388013b;

    public mj1(@Y61.k SharedPreferences sharedPreferences, @Y61.k kj1 kj1Var) {
        this.f388012a = sharedPreferences;
        this.f388013b = kj1Var;
    }

    @Y61.l
    public final String a(@Y61.k oj1 oj1Var) {
        return this.f388012a.getString(oj1Var.a() + '-' + oj1Var.b(), null);
    }

    public mj1(@Y61.k Context context) {
        this(n31.a(new n31(), context, "ViewSizeInfoStorage"), new kj1());
    }

    public final void a(@Y61.k oj1 oj1Var, @Y61.k jj1 jj1Var) {
        String str = oj1Var.a() + '-' + oj1Var.b();
        this.f388013b.getClass();
        this.f388012a.edit().putString(str, kj1.a(jj1Var).toString()).apply();
    }
}
