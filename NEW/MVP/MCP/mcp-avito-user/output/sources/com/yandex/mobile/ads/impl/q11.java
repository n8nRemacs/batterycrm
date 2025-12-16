package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* loaded from: classes8.dex */
final class q11 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ArrayList f389049a;

    public q11(@j.N y40 y40Var) {
        this.f389049a = a(y40Var);
    }

    @j.N
    private static ArrayList a(@j.N y40 y40Var) {
        ArrayList arrayList = new ArrayList();
        p60 p60VarC = y40Var.c();
        if (p60VarC != null) {
            arrayList.add(new ut0(p60VarC, 0L));
        }
        arrayList.addAll(y40Var.a());
        return arrayList;
    }

    @j.N
    public final ArrayList a() {
        return this.f389049a;
    }
}
