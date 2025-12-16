package com.avito.android.service_orders.list.blueprints.banner_item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrdersBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f279261a;

    public b(Provider<c> provider) {
        this.f279261a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f279261a.get());
    }
}
