package com.avito.android.travel_search.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelSearchReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<q> f303198a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.travel_search.domain.m> f303199b;

    /* renamed from: c, reason: collision with root package name */
    public final u f303200c;

    public p(u uVar, Provider provider, Provider provider2) {
        this.f303198a = provider;
        this.f303199b = provider2;
        this.f303200c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f303198a.get(), this.f303199b.get(), (com.avito.android.serp.i) this.f303200c.get());
    }
}
