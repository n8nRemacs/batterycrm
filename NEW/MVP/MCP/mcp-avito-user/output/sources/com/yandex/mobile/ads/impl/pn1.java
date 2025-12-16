package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.fy;

/* loaded from: classes8.dex */
public final class pn1<T extends fy<T>> implements lx<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final rx<T> f388897a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final an1 f388898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final tn1<qn1> f388899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private qn1 f388900d;

    @X41.j
    public pn1(@Y61.k rx<T> rxVar, @Y61.k ko1 ko1Var, @Y61.k n2 n2Var, @Y61.k cy cyVar, @Y61.k rn1 rn1Var, @Y61.k an1 an1Var, @Y61.k tn1<qn1> tn1Var) {
        this.f388897a = rxVar;
        this.f388898b = an1Var;
        this.f388899c = tn1Var;
    }

    public final class a implements un1<qn1> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.un1
        public final void a(qn1 qn1Var) {
            ((pn1) pn1.this).f388900d = qn1Var;
            ((pn1) pn1.this).f388897a.p();
        }

        @Override // com.yandex.mobile.ads.impl.un1
        public final void a(@Y61.k w2 w2Var) {
            ((pn1) pn1.this).f388897a.b(w2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@Y61.k Context context) {
        this.f388899c.a();
        qn1 qn1Var = this.f388900d;
        if (qn1Var != null) {
            qn1Var.d();
        }
        this.f388900d = null;
    }

    public /* synthetic */ pn1(rx rxVar, ko1 ko1Var) {
        n2 n2VarD = rxVar.d();
        cy cyVar = new cy();
        rn1 rn1Var = new rn1(rxVar.h(), ko1Var, n2VarD);
        this(rxVar, ko1Var, n2VarD, cyVar, rn1Var, new an1(n2VarD), new tn1(n2VarD, cyVar, rn1Var));
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@Y61.k T t12, @Y61.k Activity activity) {
        qn1 qn1Var = this.f388900d;
        if (qn1Var != null) {
            qn1Var.a(activity, t12.g());
        }
        this.f388900d = null;
    }

    @Override // com.yandex.mobile.ads.impl.lx
    public final void a(@Y61.k Context context, @Y61.k AdResponse<String> adResponse) {
        this.f388898b.a(context, adResponse, (pl0) null);
        this.f388898b.a(context, adResponse, (ql0) null);
        this.f388899c.a(context, adResponse, new a());
    }
}
