package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class vc0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final tc0 f390845a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final fg f390846b;

    public vc0(@j.N Context context) {
        tc0 tc0VarA = new mx0(context).a();
        this.f390845a = tc0VarA;
        this.f390846b = new fg(tc0VarA);
    }

    @j.P
    public final rc0 a(@j.N im imVar) {
        double d12 = -1.0d;
        rc0 rc0Var = null;
        for (rc0 rc0Var2 : imVar.f()) {
            double d13 = "video/mp4".equals(rc0Var2.c()) ? 1.5d : 1.0d;
            int iA2 = this.f390846b.a(rc0Var2);
            int iA3 = this.f390845a.a();
            double dAbs = d13 / ((Math.max(0, iA2) < 100 ? 10.0d : Math.abs(iA3 - r4) / iA3) + 1.0d);
            if (dAbs > d12) {
                rc0Var = rc0Var2;
                d12 = dAbs;
            }
        }
        return rc0Var;
    }
}
