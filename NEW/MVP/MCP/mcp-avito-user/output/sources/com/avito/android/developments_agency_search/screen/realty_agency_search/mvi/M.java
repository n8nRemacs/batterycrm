package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: RealtyAgencySearchOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f138759a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.realty_agency.beduin.b f138760b;

    public M(Provider provider, com.avito.android.realty_agency.beduin.b bVar) {
        this.f138759a = provider;
        this.f138760b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f138759a.get();
        this.f138760b.getClass();
        return new L(context, new com.avito.android.realty_agency.beduin.a());
    }
}
