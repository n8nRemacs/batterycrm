package com.avito.android.cart_similar_items.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: GetNextPageUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f115956a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f115957b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f115958c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f115959d;

    public H(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f115956a = lVar;
        this.f115957b = provider;
        this.f115958c = provider2;
        this.f115959d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new G(((Integer) this.f115956a.f393949a).intValue(), this.f115957b.get(), this.f115958c.get(), this.f115959d.get());
    }
}
