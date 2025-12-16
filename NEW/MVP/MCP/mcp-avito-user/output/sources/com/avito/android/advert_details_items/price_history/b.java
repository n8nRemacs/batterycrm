package com.avito.android.advert_details_items.price_history;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceHistoryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f85390a;

    /* renamed from: b, reason: collision with root package name */
    public final h f85391b;

    public b(Provider provider, h hVar) {
        this.f85390a = provider;
        this.f85391b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f85390a.get(), (f) this.f85391b.get());
    }
}
