package com.avito.android.travel_search.mvi;

import com.avito.android.travel_search.TravelSearchOpenParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelSearchBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.travel_search.domain.h> f303180a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f303181b;

    public h(dagger.internal.l lVar, Provider provider) {
        this.f303180a = provider;
        this.f303181b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f303180a.get(), (TravelSearchOpenParams) this.f303181b.f393949a);
    }
}
