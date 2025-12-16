package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xw.InterfaceC50010b;

/* compiled from: DealCabinetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f137073a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.deal_cabinet.a> f137074b;

    /* renamed from: c, reason: collision with root package name */
    public final u f137075c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f137073a = provider;
        this.f137074b = provider2;
        this.f137075c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f137073a.get(), this.f137074b.get(), (InterfaceC50010b) this.f137075c.get());
    }
}
