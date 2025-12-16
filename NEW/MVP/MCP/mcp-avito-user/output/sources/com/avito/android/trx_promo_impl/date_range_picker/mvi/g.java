package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoDateRangePickerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f304046a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.date_range_picker.data.mapper.c f304047b;

    public g(Provider provider, com.avito.android.trx_promo_impl.date_range_picker.data.mapper.c cVar) {
        this.f304046a = provider;
        this.f304047b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f304046a.get();
        this.f304047b.getClass();
        return new e(aVar, new com.avito.android.trx_promo_impl.date_range_picker.data.mapper.b());
    }
}
