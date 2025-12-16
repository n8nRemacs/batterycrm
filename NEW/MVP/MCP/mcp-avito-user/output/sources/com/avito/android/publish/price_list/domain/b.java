package com.avito.android.publish.price_list.domain;

import com.avito.android.publish.C0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceListPublishStepProvider_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f238530a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f238531b;

    public b(dagger.internal.l lVar, Provider provider) {
        this.f238530a = provider;
        this.f238531b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f238530a.get(), (Integer) this.f238531b.f393949a);
    }
}
