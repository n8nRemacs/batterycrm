package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import d11.AbstractC39485b;

/* loaded from: classes8.dex */
public final class qf0 implements lx<f01> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ee0<AbstractC39485b, d11.c> f389156a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final sf0 f389157b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final n01 f389158c;

    public qf0(@j.N rx<f01> rxVar, @j.N AdResponse<String> adResponse, @j.N MediationData mediationData) {
        n2 n2VarD = rxVar.d();
        af0 af0Var = new af0(n2VarD);
        re0 re0Var = new re0(n2VarD, adResponse);
        rf0 rf0Var = new rf0(new ke0(mediationData.c(), af0Var, re0Var));
        a4 a4VarE = rxVar.e();
        wr0 wr0Var = new wr0(rxVar, mediationData, a4VarE);
        sf0 sf0Var = new sf0();
        this.f389157b = sf0Var;
        ee0<AbstractC39485b, d11.c> ee0Var = new ee0<>(n2VarD, a4VarE, sf0Var, re0Var, rf0Var, wr0Var);
        this.f389156a = ee0Var;
        this.f389158c = new n01(rxVar, ee0Var);
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N fy fyVar, @j.N Activity activity) {
        f01 f01Var = (f01) fyVar;
        AbstractC39485b abstractC39485bA = this.f389157b.a();
        if (abstractC39485bA != null) {
            this.f389158c.a(f01Var);
            abstractC39485bA.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N Context context) {
        this.f389156a.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N Context context, @j.N AdResponse<String> adResponse) {
        this.f389156a.a(context, (Context) this.f389158c);
    }
}
