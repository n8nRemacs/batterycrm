package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o3 f388721a = o3.b();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n3 f388722b;

    public p3(@j.N n3 n3Var) {
        this.f388722b = n3Var;
    }

    public final void a() {
        String strA = this.f388722b.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f388721a.a(strA);
    }

    public final void b() {
        String strA = this.f388722b.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f388721a.b(strA);
    }
}
