package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;

/* compiled from: RealtyAgencySearchReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class d0 implements dagger.internal.h<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f138805a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f138806b;

    public d0(dagger.internal.l lVar, g0 g0Var) {
        this.f138805a = lVar;
        this.f138806b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b0((RealtyAgencySearchArguments) this.f138805a.f393949a, (e0) this.f138806b.get());
    }
}
