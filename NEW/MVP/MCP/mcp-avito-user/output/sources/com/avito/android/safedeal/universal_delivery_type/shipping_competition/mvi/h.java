package com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi;

import Vn0.C15698d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeShippingCompetitionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f256850a;

    /* renamed from: b, reason: collision with root package name */
    public final j f256851b;

    /* renamed from: c, reason: collision with root package name */
    public final n f256852c;

    public h(e eVar, j jVar, n nVar) {
        this.f256850a = eVar;
        this.f256851b = jVar;
        this.f256852c = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f256850a.get();
        this.f256851b.getClass();
        i iVar = new i();
        this.f256852c.getClass();
        return new g("Shipping_competition_mvi", new C15698d(null, 1, null), new f(dVar, new m(), iVar));
    }
}
