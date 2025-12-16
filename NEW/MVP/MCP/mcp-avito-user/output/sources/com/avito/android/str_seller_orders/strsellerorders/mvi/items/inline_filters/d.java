package com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineFiltersItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f290004a;

    public d(Provider<e> provider) {
        this.f290004a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f290004a.get());
    }
}
