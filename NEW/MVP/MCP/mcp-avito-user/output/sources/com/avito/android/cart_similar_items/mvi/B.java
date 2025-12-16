package com.avito.android.cart_similar_items.mvi;

import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: CartSimilarItemsReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f115930a;

    public B(Provider<InterfaceC40691b> provider) {
        this.f115930a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f115930a.get());
    }
}
