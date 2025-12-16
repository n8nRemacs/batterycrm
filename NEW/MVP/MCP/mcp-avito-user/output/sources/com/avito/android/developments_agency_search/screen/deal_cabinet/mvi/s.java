package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ri0.InterfaceC47661a;

/* compiled from: DealCabinetReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.deal_cabinet.a> f137157a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Boolean> f137158b;

    /* renamed from: c, reason: collision with root package name */
    public final u f137159c;

    public s(u uVar, Provider provider, Provider provider2) {
        this.f137157a = provider;
        this.f137158b = provider2;
        this.f137159c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f137157a.get(), this.f137158b.get().booleanValue(), (InterfaceC47661a) this.f137159c.get());
    }
}
