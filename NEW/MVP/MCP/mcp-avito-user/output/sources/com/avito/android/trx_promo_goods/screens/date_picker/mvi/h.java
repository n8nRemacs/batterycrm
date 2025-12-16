package com.avito.android.trx_promo_goods.screens.date_picker.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsDatePickerActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f303729a;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f303729a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f303729a.get());
    }
}
