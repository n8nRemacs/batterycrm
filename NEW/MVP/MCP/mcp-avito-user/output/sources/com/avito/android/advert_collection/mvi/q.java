package com.avito.android.advert_collection.mvi;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCollectionReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class q implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection.l> f81684a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.sales_items.m> f81685b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<u3.h<SimpleTestGroup>> f81686c;

    public q(Provider<com.avito.android.advert_collection.l> provider, Provider<com.avito.android.sales_items.m> provider2, Provider<u3.h<SimpleTestGroup>> provider3) {
        this.f81684a = provider;
        this.f81685b = provider2;
        this.f81686c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f81684a.get(), this.f81685b.get(), this.f81686c.get());
    }
}
