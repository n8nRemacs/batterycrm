package com.avito.android.trx_promo_goods.screens.date_picker.mvi;

import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLinkContent;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoGoodsDatePickerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f303732a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f303733b;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f303732a = lVar;
        this.f303733b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((TrxPromoGoodsConfigureDatePickerLinkContent) this.f303732a.f393949a, (String) this.f303733b.f393949a);
    }
}
