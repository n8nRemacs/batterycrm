package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.C39385a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class hm0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final gm0 f386169a = new gm0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final z6 f386170b = new z6();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.i f386171c;

    public hm0(@j.N ko1 ko1Var) {
        this.f386171c = new com.yandex.mobile.ads.nativeads.i(ko1Var);
    }

    @j.N
    public final ArrayList a(@j.N Context context, @j.N uj0 uj0Var, @j.N w20 w20Var, @j.N ok0 ok0Var, @j.N sw swVar) {
        ArrayList arrayList = new ArrayList();
        List<nj0> listE = uj0Var.c().e();
        no0 no0VarD = ok0Var.d();
        for (nj0 nj0Var : listE) {
            mo0 mo0VarA = no0VarD.a(nj0Var);
            com.yandex.mobile.ads.nativeads.r rVar = new com.yandex.mobile.ads.nativeads.r(context, nj0Var, w20Var, mo0VarA);
            C39385a c39385aA = this.f386171c.a(context, uj0Var, this.f386170b.a(nj0Var), mo0VarA, ok0Var, swVar, nj0Var);
            this.f386169a.getClass();
            arrayList.add(gm0.a().a(context, nj0Var, rVar, w20Var, c39385aA));
        }
        return arrayList;
    }
}
