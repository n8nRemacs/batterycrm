package com.avito.android.trx_promo_goods.screens.date_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.trx_promo_goods.TrxPromoGoodsConfigureDatePickerScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsDatePickerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f303698a;

    public g(l lVar) {
        this.f303698a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f303698a.f393949a;
        f.f303697a.getClass();
        TrxPromoGoodsConfigureDatePickerScreen trxPromoGoodsConfigureDatePickerScreen = TrxPromoGoodsConfigureDatePickerScreen.f303314d;
        trxPromoGoodsConfigureDatePickerScreen.getClass();
        return new C28478k(trxPromoGoodsConfigureDatePickerScreen, rVar, TrxPromoGoodsConfigureDatePickerScreen.f303315e);
    }
}
