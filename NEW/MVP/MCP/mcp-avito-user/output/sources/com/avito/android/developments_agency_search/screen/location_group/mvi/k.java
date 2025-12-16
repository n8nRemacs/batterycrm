package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Hw.InterfaceC14039a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationGroupActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.location_group.l> f138195a;

    /* renamed from: b, reason: collision with root package name */
    public final u f138196b;

    public k(u uVar, Provider provider) {
        this.f138195a = provider;
        this.f138196b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f138195a.get(), (InterfaceC14039a) this.f138196b.get());
    }
}
