package com.avito.android.trx_promo_goods.screens.date_picker.di;

import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerApplyLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoGoodsDatePickerDeeplinkMappingsModule_ProvideDatePickerApplyMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.date_picker.deeplink.b f303695a;

    public d(com.avito.android.trx_promo_goods.screens.date_picker.deeplink.b bVar) {
        this.f303695a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f303694a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoGoodsConfigureDatePickerApplyLink.class, new com.avito.android.trx_promo_goods.screens.date_picker.deeplink.c(), new C43834a.b.C11809b(this.f303695a));
    }
}
