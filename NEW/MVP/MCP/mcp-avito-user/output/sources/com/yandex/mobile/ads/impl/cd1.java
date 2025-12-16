package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class cd1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final m5 f384237a;

    public cd1(@j.N md1 md1Var) {
        this.f384237a = new m5(md1Var.a());
    }

    @j.N
    public final String a() {
        String strC = this.f384237a.c();
        return TextUtils.isEmpty(strC) ? "undefined" : strC;
    }

    @j.N
    public final String b() {
        String strD = this.f384237a.d();
        return TextUtils.isEmpty(strD) ? "undefined" : strD;
    }
}
