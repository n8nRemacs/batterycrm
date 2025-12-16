package com.avito.android.publish.price_list.domain.use_case;

import com.avito.android.publish.objects.P0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SplClearPriceListUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f238586a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f238587b;

    public d(Provider<com.avito.android.publish.price_list.domain.c> provider, Provider<P0> provider2) {
        this.f238586a = provider;
        this.f238587b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f238586a.get(), this.f238587b.get());
    }
}
