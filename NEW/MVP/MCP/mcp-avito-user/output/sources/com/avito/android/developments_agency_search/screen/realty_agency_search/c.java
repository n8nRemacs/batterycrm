package com.avito.android.developments_agency_search.screen.realty_agency_search;

import android.content.Context;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyAgencySearchConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f138470a;

    /* renamed from: b, reason: collision with root package name */
    public final u f138471b;

    public c(u uVar, Provider provider) {
        this.f138470a = provider;
        this.f138471b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f138470a.get(), (l) this.f138471b.get());
    }
}
