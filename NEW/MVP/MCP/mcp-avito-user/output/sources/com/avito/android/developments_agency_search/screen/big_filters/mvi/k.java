package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import com.avito.android.search.filter.w1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import uw.InterfaceC49120b;

/* compiled from: BigFiltersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.big_filters.f> f136731a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<w1> f136732b;

    /* renamed from: c, reason: collision with root package name */
    public final u f136733c;

    public k(u uVar, Provider provider, Provider provider2) {
        this.f136731a = provider;
        this.f136732b = provider2;
        this.f136733c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f136731a.get(), this.f136732b.get(), (InterfaceC49120b) this.f136733c.get());
    }
}
