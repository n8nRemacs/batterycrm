package com.avito.android.cart_similar_items.mvi;

import com.avito.android.cart_similar_items.model.CartSimilarItemsArguments;
import com.avito.android.util.R0;
import javax.inject.Provider;
import nn.InterfaceC44450a;

/* compiled from: CartSimilarItemsRepositoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44450a> f115941a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f115942b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f115943c;

    public E(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f115941a = provider;
        this.f115942b = lVar;
        this.f115943c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D(dagger.internal.g.b(this.f115941a), (CartSimilarItemsArguments) this.f115942b.f393949a, this.f115943c.get());
    }
}
