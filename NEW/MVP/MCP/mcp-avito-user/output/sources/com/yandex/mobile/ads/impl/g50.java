package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class g50 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o40 f385597a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final np f385598b;

    public g50(@j.N o40 o40Var, @j.N x50 x50Var) {
        this.f385597a = o40Var;
        this.f385598b = new np(x50Var);
    }

    @j.P
    public final se1 a(@j.N lu luVar) {
        Context context = luVar.getContext();
        se1 se1VarA = this.f385597a.a();
        return se1VarA == null ? this.f385598b.a(context, luVar) : se1VarA;
    }
}
