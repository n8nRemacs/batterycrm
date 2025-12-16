package com.avito.android.advert.item.reusable_amenities;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenitiesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f78608a;

    /* renamed from: b, reason: collision with root package name */
    public final u f78609b;

    public b(u uVar, Provider provider) {
        this.f78608a = provider;
        this.f78609b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f78608a.get(), (com.avito.android.advert_amenities.amenity.j) this.f78609b.get());
    }
}
