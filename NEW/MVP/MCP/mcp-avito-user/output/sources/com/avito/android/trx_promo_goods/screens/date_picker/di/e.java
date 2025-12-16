package com.avito.android.trx_promo_goods.screens.date_picker.di;

import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLink;
import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoGoodsDatePickerDeeplinkMappingsModule_ProvideDatePickerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_goods.screens.date_picker.deeplink.f f303696a;

    public e(com.avito.android.trx_promo_goods.screens.date_picker.deeplink.f fVar) {
        this.f303696a = fVar;
    }

    public static C43834a a(com.avito.android.trx_promo_goods.screens.date_picker.deeplink.f fVar) {
        c.f303694a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoGoodsConfigureDatePickerLink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoGoodsConfigureDatePickerLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f303696a);
    }
}
