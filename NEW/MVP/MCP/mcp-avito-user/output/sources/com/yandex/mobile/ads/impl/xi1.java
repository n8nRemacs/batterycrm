package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class xi1 extends bj1<ho0, me1> {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final do0 f391728b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ui1 f391729c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final vi1 f391730d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private ti1 f391731e;

    public xi1(@j.N ho0 ho0Var, @j.N oh1 oh1Var, @j.N n2 n2Var, @j.N AdResponse adResponse, @j.N n30 n30Var, @j.N sn0 sn0Var, @j.N cm0 cm0Var) {
        super(ho0Var);
        Context context = ho0Var.getContext();
        this.f391729c = new ui1();
        this.f391728b = new do0(context, this, oh1Var, n2Var, adResponse, n30Var, sn0Var, cm0Var);
        vi1 vi1Var = new vi1();
        this.f391730d = vi1Var;
        n30Var.a(vi1Var);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        ho0 ho0Var = (ho0) view;
        this.f391728b.a(ho0Var);
        super.a(ho0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N me1 me1Var) {
        ho0 ho0Var = (ho0) view;
        ff1<yn0> ff1VarA = me1Var.a();
        ui1 ui1Var = this.f391729c;
        Context context = ho0Var.getContext();
        EnumC39381y1 enumC39381y1 = EnumC39381y1.f391879d;
        ui1Var.getClass();
        ti1 ti1VarA = ui1.a(context, ff1VarA, enumC39381y1);
        this.f391731e = ti1VarA;
        this.f391730d.a(ti1VarA);
        this.f391728b.a(ho0Var, ff1VarA, this.f391731e);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N eb ebVar, @j.N ej1 ej1Var, @j.P me1 me1Var) {
        me1 me1Var2 = me1Var;
        ho0 ho0VarB = b();
        if (ho0VarB != null) {
            ej1Var.a(ho0VarB, ebVar);
            if (me1Var2 == null || this.f391731e == null) {
                return;
            }
            ff1<yn0> ff1VarA = me1Var2.a();
            ej1Var.a(ebVar, new bh1(ho0VarB, ff1VarA.a()));
            this.f391728b.a(ho0VarB, ff1VarA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final /* bridge */ /* synthetic */ boolean a(@j.N View view, @j.N me1 me1Var) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a() {
        ti1 ti1Var = this.f391731e;
        if (ti1Var != null) {
            ti1Var.k();
        }
        this.f391730d.a(null);
    }
}
