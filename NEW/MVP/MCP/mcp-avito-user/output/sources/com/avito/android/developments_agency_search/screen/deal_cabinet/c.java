package com.avito.android.developments_agency_search.screen.deal_cabinet;

import android.content.Context;
import d20.C39487a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealCabinetConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f136907a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f136908b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.realty_agency.beduin.b f136909c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C39487a> f136910d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<AO0.b> f136911e;

    public c(Provider provider, dagger.internal.l lVar, com.avito.android.realty_agency.beduin.b bVar, Provider provider2, Provider provider3) {
        this.f136907a = provider;
        this.f136908b = lVar;
        this.f136909c = bVar;
        this.f136910d = provider2;
        this.f136911e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f136907a.get();
        DealCabinetArguments dealCabinetArguments = (DealCabinetArguments) this.f136908b.f393949a;
        this.f136909c.getClass();
        return new b(context, dealCabinetArguments, new com.avito.android.realty_agency.beduin.a(), this.f136910d.get(), this.f136911e.get());
    }
}
