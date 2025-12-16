package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import Qn0.c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeCourierFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f256547a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256548b;

    /* renamed from: c, reason: collision with root package name */
    public final q f256549c;

    /* renamed from: d, reason: collision with root package name */
    public final b f256550d;

    public j(g gVar, l lVar, q qVar, b bVar) {
        this.f256547a = gVar;
        this.f256548b = lVar;
        this.f256549c = qVar;
        this.f256550d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f256547a.get();
        this.f256548b.getClass();
        k kVar = new k();
        this.f256549c.getClass();
        return new i("UniversalDeliveryTypeCourier", c.b.f14007b, new h(fVar, new p(), kVar, (a) this.f256550d.get()));
    }
}
