package com.avito.android.developments_agency_search.screen.location_group.mvi;

import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationGroupBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.location_group.l> f138203a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f138204b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f138203a = provider;
        this.f138204b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f138203a.get(), (LocationGroupArguments) this.f138204b.f393949a);
    }
}
