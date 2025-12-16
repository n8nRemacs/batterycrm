package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class gf1<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final tf1<T> f385742a;

    public gf1(@j.N tf1<T> tf1Var) {
        this.f385742a = tf1Var;
    }

    @j.N
    public final ff1<T> a(@j.N sd1 sd1Var, int i12, int i13) {
        ne1 ne1VarD = sd1Var.d();
        im imVarA = sd1Var.a();
        rc0 rc0VarB = sd1Var.b();
        a61 a61VarC = sd1Var.c();
        String strE = sd1Var.e();
        JSONObject jSONObjectF = sd1Var.f();
        return new ff1<>(imVarA, ne1VarD, rc0VarB, this.f385742a.a(ne1VarD, imVarA, rc0VarB, new eg1(i12, i13 + 1), strE, jSONObjectF), a61VarC);
    }
}
