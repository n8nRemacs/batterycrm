package com.avito.android.advert.item.safedeal;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: CartItemRepository_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E6.a> f78775a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f78776b;

    public W(Provider<E6.a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f78775a = provider;
        this.f78776b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new V(this.f78776b.get(), dagger.internal.g.b(this.f78775a));
    }
}
