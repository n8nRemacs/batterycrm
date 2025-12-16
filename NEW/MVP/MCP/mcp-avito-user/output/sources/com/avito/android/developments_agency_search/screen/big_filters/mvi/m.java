package com.avito.android.developments_agency_search.screen.big_filters.mvi;

import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BigFiltersBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.big_filters.f> f136740a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f136741b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f136740a = provider;
        this.f136741b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f136740a.get(), (BigFiltersArguments) this.f136741b.f393949a);
    }
}
