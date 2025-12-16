package com.avito.android.advert.item.other_categories;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OtherCategoriesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77844a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f77845b;

    public b(u uVar, Provider provider) {
        this.f77844a = uVar;
        this.f77845b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f77844a.get(), this.f77845b.get());
    }
}
