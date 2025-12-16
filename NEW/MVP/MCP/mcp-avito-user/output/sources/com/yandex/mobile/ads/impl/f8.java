package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes8.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final at f385215a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final br0 f385216b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39379y f385217c = new C39379y();

    public f8(@j.N at atVar, @j.N br0 br0Var) {
        this.f385215a = atVar;
        this.f385216b = br0Var;
    }

    public final void a(@j.N View view, @j.N x7 x7Var) {
        i8 i8Var;
        this.f385217c.getClass();
        Context contextA = C39379y.a(view);
        if (contextA == null || !g7.a(contextA)) {
            return;
        }
        try {
            i8Var = new i8(contextA);
        } catch (Throwable unused) {
            i8Var = null;
        }
        if (i8Var != null) {
            new b8(new d8(contextA, i8Var).a(), i8Var, this.f385215a, this.f385216b).a(x7Var.b());
        }
    }
}
