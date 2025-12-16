package com.avito.android.cart_similar_items.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;
import ln.C43801b;

/* compiled from: GetSimilarItemsUseCaseImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f115971a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f115972b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f115973c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f115974d;

    public K(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f115971a = provider;
        this.f115972b = provider2;
        this.f115973c = provider3;
        this.f115974d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new J(this.f115971a.get(), this.f115972b.get(), this.f115973c.get(), (C43801b) this.f115974d.get());
    }
}
