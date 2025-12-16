package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import c11.AbstractC26922a;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.fy;

/* loaded from: classes8.dex */
public final class gf0<T extends fy<T>> implements lx<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> f385739a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ff0 f385740b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final z70<T> f385741c;

    public gf0(@j.N rx<T> rxVar, @j.N AdResponse<String> adResponse, @j.N MediationData mediationData) {
        n2 n2VarD = rxVar.d();
        af0 af0Var = new af0(n2VarD);
        re0 re0Var = new re0(n2VarD, adResponse);
        ef0 ef0Var = new ef0(new ke0(mediationData.c(), af0Var, re0Var));
        a4 a4VarE = rxVar.e();
        wr0 wr0Var = new wr0(rxVar, mediationData, a4VarE);
        ff0 ff0Var = new ff0();
        this.f385740b = ff0Var;
        ee0<AbstractC26922a, AbstractC26922a.InterfaceC2026a> ee0Var = new ee0<>(n2VarD, a4VarE, ff0Var, re0Var, ef0Var, wr0Var);
        this.f385739a = ee0Var;
        this.f385741c = new z70<>(rxVar, ee0Var);
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N Context context) {
        this.f385739a.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N Context context, @j.N AdResponse<String> adResponse) {
        this.f385739a.a(context, (Context) this.f385741c);
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@j.N T t12, @j.N Activity activity) {
        AbstractC26922a abstractC26922aA = this.f385740b.a();
        if (abstractC26922aA != null) {
            this.f385741c.a(t12);
            abstractC26922aA.c();
        }
    }
}
