package com.avito.android.publish.price_list.domain.use_case;

import com.avito.android.publish.C0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SplApplyPretendPriceListResultUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f238582a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f238583b;

    public b(Provider<com.avito.android.publish.price_list.domain.c> provider, Provider<C0> provider2) {
        this.f238582a = provider;
        this.f238583b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f238582a.get(), this.f238583b.get());
    }
}
