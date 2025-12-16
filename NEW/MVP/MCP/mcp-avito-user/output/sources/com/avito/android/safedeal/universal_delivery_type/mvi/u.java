package com.avito.android.safedeal.universal_delivery_type.mvi;

import Un0.C15542c;

/* compiled from: UniversalDeliveryTypeFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final r f256731a;

    /* renamed from: b, reason: collision with root package name */
    public final e f256732b;

    /* renamed from: c, reason: collision with root package name */
    public final w f256733c;

    /* renamed from: d, reason: collision with root package name */
    public final A f256734d;

    public u(r rVar, e eVar, w wVar, A a12) {
        this.f256731a = rVar;
        this.f256732b = eVar;
        this.f256733c = wVar;
        this.f256734d = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f256731a.get();
        d dVar = (d) this.f256732b.get();
        this.f256733c.getClass();
        v vVar = new v();
        this.f256734d.getClass();
        return new t("UniversalDeliveryType", new C15542c(C15542c.a.C1146c.f16597a), new s(pVar, dVar, new y(), vVar));
    }
}
