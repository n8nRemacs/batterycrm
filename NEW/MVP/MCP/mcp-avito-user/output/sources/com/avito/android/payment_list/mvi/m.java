package com.avito.android.payment_list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final h f215003a;

    /* renamed from: b, reason: collision with root package name */
    public final o f215004b;

    /* renamed from: c, reason: collision with root package name */
    public final q f215005c;

    /* renamed from: d, reason: collision with root package name */
    public final j f215006d;

    public m(h hVar, o oVar, q qVar, j jVar) {
        this.f215003a = hVar;
        this.f215004b = oVar;
        this.f215005c = qVar;
        this.f215006d = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f215003a.get();
        this.f215004b.getClass();
        n nVar = new n();
        this.f215005c.getClass();
        return new l("PaymentListScreen", new E60.d(null, false, false, false, false, false, 63, null), new k(gVar, nVar, new p(), (i) this.f215006d.get()));
    }
}
