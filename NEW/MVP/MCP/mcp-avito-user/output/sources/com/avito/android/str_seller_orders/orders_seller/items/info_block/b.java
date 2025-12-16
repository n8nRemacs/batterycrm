package com.avito.android.str_seller_orders.orders_seller.items.info_block;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InfoBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f289481a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f289482b;

    public b(f fVar, Provider provider) {
        this.f289481a = fVar;
        this.f289482b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f289481a.get(), this.f289482b.get());
    }
}
