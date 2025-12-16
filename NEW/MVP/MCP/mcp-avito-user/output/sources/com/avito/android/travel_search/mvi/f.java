package com.avito.android.travel_search.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import is0.InterfaceC42100b;
import javax.inject.Provider;

/* compiled from: TravelSearchActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.travel_search.domain.h> f303170a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.n> f303171b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_toast.b> f303172c;

    /* renamed from: d, reason: collision with root package name */
    public final u f303173d;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f303170a = provider;
        this.f303171b = provider2;
        this.f303172c = provider3;
        this.f303173d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f303170a.get(), this.f303171b.get(), this.f303172c.get(), (InterfaceC42100b) this.f303173d.get());
    }
}
