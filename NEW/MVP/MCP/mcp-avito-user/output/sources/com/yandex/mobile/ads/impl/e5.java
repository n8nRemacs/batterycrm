package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f384755a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final q21 f384756b = q21.b();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final l7 f384757c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final k7 f384758d;

    public e5(@j.N Context context, @j.N l7 l7Var, @j.N k7 k7Var) {
        this.f384755a = context;
        this.f384757c = l7Var;
        this.f384758d = k7Var;
    }

    public final boolean a() {
        v11 v11VarA = this.f384756b.a(this.f384755a);
        return ((v11VarA == null || v11VarA.M()) ? this.f384757c.b() : this.f384757c.a()) && this.f384758d.a();
    }
}
