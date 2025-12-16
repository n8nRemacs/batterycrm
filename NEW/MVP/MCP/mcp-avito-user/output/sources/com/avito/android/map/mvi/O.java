package com.avito.android.map.mvi;

import aY.InterfaceC19837a;
import aY.InterfaceC19840d;
import javax.inject.Provider;
import lW.InterfaceC43691a;

/* compiled from: MapReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class O implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19840d> f184975a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f184976b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.map.di.v f184977c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.map.analytics.a> f184978d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC43691a> f184979e;

    /* renamed from: f, reason: collision with root package name */
    public final S f184980f;

    public O(Provider provider, dagger.internal.u uVar, com.avito.android.map.di.v vVar, Provider provider2, Provider provider3, S s5) {
        this.f184975a = provider;
        this.f184976b = uVar;
        this.f184977c = vVar;
        this.f184978d = provider2;
        this.f184979e = provider3;
        this.f184980f = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC19840d interfaceC19840d = this.f184975a.get();
        InterfaceC19837a interfaceC19837a = (InterfaceC19837a) this.f184976b.get();
        com.avito.android.map_core.view.e eVar = (com.avito.android.map_core.view.e) this.f184977c.get();
        com.avito.android.map.analytics.a aVar = this.f184978d.get();
        InterfaceC43691a interfaceC43691a = this.f184979e.get();
        this.f184980f.getClass();
        return new M(interfaceC19840d, interfaceC19837a, eVar, aVar, interfaceC43691a, new Q());
    }
}
