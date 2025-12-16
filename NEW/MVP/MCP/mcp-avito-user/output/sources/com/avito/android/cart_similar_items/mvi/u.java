package com.avito.android.cart_similar_items.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;
import ln.C43801b;

/* compiled from: CartSimilarItemsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f116122a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f116123b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43801b> f116124c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f116125d;

    public u(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f116122a = uVar;
        this.f116123b = provider;
        this.f116124c = provider2;
        this.f116125d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((I) this.f116122a.get(), this.f116123b.get(), this.f116124c.get(), this.f116125d.get());
    }
}
