package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class do0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yg1 f384638a = new yg1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ln0 f384639b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final bo0 f384640c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final cm0 f384641d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private ao0 f384642e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private bm0 f384643f;

    public do0(@j.N Context context, @j.N xi1 xi1Var, @j.N oh1 oh1Var, @j.N n2 n2Var, @j.N AdResponse adResponse, @j.N mh1 mh1Var, @j.N sn0 sn0Var, @j.N cm0 cm0Var) {
        this.f384640c = new bo0(xi1Var, oh1Var, n2Var, adResponse, mh1Var, sn0Var);
        this.f384639b = new ln0(context, adResponse, n2Var);
        this.f384641d = cm0Var;
    }

    public final void a(@j.N ho0 ho0Var, @j.N ff1<yn0> ff1Var, @j.N ri1 ri1Var) {
        du duVarA = this.f384639b.a(ff1Var);
        ao0 ao0VarA = this.f384640c.a(ho0Var.getContext(), duVarA, ff1Var, ri1Var);
        this.f384642e = ao0VarA;
        ao0VarA.a(ho0Var);
        bm0 bm0Var = new bm0(duVarA);
        this.f384643f = bm0Var;
        this.f384641d.a(bm0Var);
        ho0Var.setOnAttachStateChangeListener(new pn0(duVarA, ho0Var));
    }

    public final void a(@j.N ho0 ho0Var, @j.N ff1<yn0> ff1Var) {
        this.f384638a.getClass();
        ho0Var.setAspectRatio(ff1Var.c().getAdHeight() != 0 ? r3.getAdWidth() / r3.getAdHeight() : 1.7777778f);
        ao0 ao0Var = this.f384642e;
        if (ao0Var != null) {
            ao0Var.a();
        }
    }

    public final void a(@j.N ho0 ho0Var) {
        ao0 ao0Var = this.f384642e;
        if (ao0Var != null) {
            ao0Var.b(ho0Var);
        }
        bm0 bm0Var = this.f384643f;
        if (bm0Var != null) {
            this.f384641d.b(bm0Var);
            this.f384643f = null;
        }
        ho0Var.setOnAttachStateChangeListener(null);
    }
}
