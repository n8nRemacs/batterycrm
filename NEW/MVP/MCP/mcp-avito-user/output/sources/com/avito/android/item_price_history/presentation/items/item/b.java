package com.avito.android.item_price_history.presentation.items.item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ItemPriceHistoryItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f173762a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f173763b;

    public b(e eVar, Provider provider) {
        this.f173762a = eVar;
        this.f173763b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f173762a.getClass();
        return new a(new d(), this.f173763b.get());
    }
}
