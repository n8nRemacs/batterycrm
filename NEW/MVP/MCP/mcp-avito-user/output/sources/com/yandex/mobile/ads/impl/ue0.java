package com.yandex.mobile.ads.impl;

import android.content.Context;
import b11.AbstractC25389a;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
public final class ue0 implements ud {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AbstractC25389a.InterfaceC1985a f390525a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> f390526b;

    public ue0(@j.N com.yandex.mobile.ads.banner.f fVar, @j.N AdResponse<String> adResponse, @j.N MediationData mediationData) {
        n2 n2VarD = fVar.d();
        we0 we0Var = new we0(n2VarD);
        re0 re0Var = new re0(n2VarD, adResponse);
        se0 se0Var = new se0(new ke0(mediationData.c(), we0Var, re0Var));
        a4 a4VarE = fVar.e();
        ee0<AbstractC25389a, AbstractC25389a.InterfaceC1985a> ee0Var = new ee0<>(n2VarD, a4VarE, new te0(), re0Var, se0Var, new wr0(fVar, mediationData, a4VarE));
        this.f390526b = ee0Var;
        this.f390525a = new td(fVar, ee0Var, new ze0(fVar.x()));
    }

    @Override // com.yandex.mobile.ads.impl.ud
    public final void a(@j.N Context context) {
        this.f390526b.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.ud
    public final void a(@j.N Context context, @j.N AdResponse<String> adResponse) {
        this.f390526b.a(context, (Context) this.f390525a);
    }
}
