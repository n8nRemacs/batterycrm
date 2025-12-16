package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
public final class mf0 implements ul0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.monetization.ads.mediation.nativeads.g f387987a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ee0<com.monetization.ads.mediation.nativeads.f, com.monetization.ads.mediation.nativeads.g> f387988b;

    public mf0(@j.N com.yandex.mobile.ads.nativeads.o oVar, @j.N AdResponse<bl0> adResponse, @j.N MediationData mediationData) {
        n2 n2VarD = oVar.d();
        af0 af0Var = new af0(n2VarD);
        re0 re0Var = new re0(n2VarD, adResponse);
        jf0 jf0Var = new jf0(new ke0(mediationData.c(), af0Var, re0Var));
        a4 a4VarE = oVar.e();
        ee0<com.monetization.ads.mediation.nativeads.f, com.monetization.ads.mediation.nativeads.g> ee0Var = new ee0<>(n2VarD, a4VarE, new kf0(), re0Var, jf0Var, new wr0(oVar, mediationData, a4VarE));
        this.f387988b = ee0Var;
        this.f387987a = new ol0(adResponse, oVar, ee0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ul0
    public final void a(@j.N Context context, @j.N AdResponse<bl0> adResponse) {
        this.f387988b.a(context, (Context) this.f387987a);
    }
}
