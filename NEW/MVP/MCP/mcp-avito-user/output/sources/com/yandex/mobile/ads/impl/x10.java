package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class x10 extends af {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final SSLSocketFactory f391518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final gq0 f391519b;

    public x10(@Y61.l cc1 cc1Var, @Y61.l SSLSocketFactory sSLSocketFactory) {
        this.f391518a = sSLSocketFactory;
        this.f391519b = new gq0(cc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.af
    @Y61.k
    public final o10 a(@Y61.k qy0<?> qy0Var, @Y61.k Map<String, String> map) {
        int iK2 = qy0Var.k();
        int i12 = cq0.f384387c;
        iz0 iz0VarB = cq0.a(iK2, iK2, this.f391518a).a(this.f391519b.a(qy0Var, map)).b();
        int iE2 = iz0VarB.e();
        ArrayList arrayListA = ip0.a(iz0VarB.h().c());
        if (!ip0.a(qy0Var.g(), iE2)) {
            return new o10(iE2, arrayListA);
        }
        mz0 mz0VarA = iz0VarB.a();
        return new o10(iE2, arrayListA, mz0VarA != null ? (int) mz0VarA.b() : 0, ip0.a(iz0VarB));
    }
}
