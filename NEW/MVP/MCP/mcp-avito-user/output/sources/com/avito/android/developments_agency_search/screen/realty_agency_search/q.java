package com.avito.android.developments_agency_search.screen.realty_agency_search;

import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.C;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.D;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iT.C41343c;
import id.C41383a;
import javax.inject.Provider;

/* compiled from: RealtyAgencySearchViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final D f138994a;

    /* renamed from: b, reason: collision with root package name */
    public final u f138995b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C41383a> f138996c;

    public q(D d12, u uVar, Provider provider) {
        this.f138994a = d12;
        this.f138995b = uVar;
        this.f138996c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((C) this.f138994a.get(), (C41343c) this.f138995b.get(), this.f138996c.get());
    }
}
