package com.avito.android.advert_core.price_list.v2.section;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertPriceListSectionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f84162a;

    /* renamed from: b, reason: collision with root package name */
    public final L9.c f84163b;

    /* renamed from: c, reason: collision with root package name */
    public final L9.d f84164c;

    public b(Provider provider, L9.c cVar, L9.d dVar) {
        this.f84162a = provider;
        this.f84163b = cVar;
        this.f84164c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f84162a.get(), (com.avito.android.recycler.data_aware.e) this.f84163b.get(), (com.avito.konveyor.a) this.f84164c.get());
    }
}
