package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class n70 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final mj1 f388178a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final lj1 f388179b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Executor f388180c;

    @j.k0
    public n70(@Y61.k mj1 mj1Var, @Y61.k lj1 lj1Var, @Y61.k Executor executor) {
        this.f388178a = mj1Var;
        this.f388179b = lj1Var;
        this.f388180c = executor;
    }

    public final void a(@Y61.k n2 n2Var, @Y61.l com.yandex.mobile.ads.banner.h hVar) {
        String strC;
        if (hVar == null || (strC = n2Var.c()) == null) {
            return;
        }
        int iL2 = n2Var.l();
        this.f388180c.execute(new T0(this, new oj1(iL2, strC), nj1.a(hVar), n2Var, 1));
    }

    public /* synthetic */ n70(mj1 mj1Var, lj1 lj1Var) {
        this(mj1Var, lj1Var, Executors.newSingleThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(n70 n70Var, oj1 oj1Var, jj1 jj1Var, n2 n2Var) {
        n70Var.f388178a.a(oj1Var, jj1Var);
        n70Var.f388179b.a(jj1Var, n2Var);
    }

    public n70(@Y61.k Context context) {
        this(new mj1(context), new lj1(context));
    }
}
