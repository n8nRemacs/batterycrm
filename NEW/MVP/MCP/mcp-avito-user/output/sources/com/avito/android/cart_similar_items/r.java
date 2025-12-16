package com.avito.android.cart_similar_items;

import com.avito.android.cart_similar_items.mvi.w;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: CartSimilarItemsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f116144a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cart_similar_items.mvi.x f116145b;

    public r(Provider provider, com.avito.android.cart_similar_items.mvi.x xVar) {
        this.f116144a = provider;
        this.f116145b = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f116144a.get(), (w) this.f116145b.get());
    }
}
