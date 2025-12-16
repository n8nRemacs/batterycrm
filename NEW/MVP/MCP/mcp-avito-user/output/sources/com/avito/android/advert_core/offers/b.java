package com.avito.android.advert_core.offers;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OffersItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f83811a;

    /* renamed from: b, reason: collision with root package name */
    public final u f83812b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.offers.items.small_card.c> f83813c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f83811a = provider;
        this.f83812b = uVar;
        this.f83813c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f83811a.get(), (com.avito.konveyor.a) this.f83812b.get(), this.f83813c.get());
    }
}
