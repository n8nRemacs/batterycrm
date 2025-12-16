package com.avito.android.trx_promo_goods.screens.date_picker;

import com.avito.android.trx_promo_goods.screens.date_picker.mvi.l;
import com.avito.android.trx_promo_goods.screens.date_picker.mvi.m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TrxPromoGoodsDatePickerViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final m f303699a;

    public f(m mVar) {
        this.f303699a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f303699a.get();
        i2.f411430a.getClass();
        return new e(lVar, i2.a.f411433c);
    }
}
