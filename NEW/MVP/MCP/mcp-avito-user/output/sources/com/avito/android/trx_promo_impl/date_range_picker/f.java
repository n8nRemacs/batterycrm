package com.avito.android.trx_promo_impl.date_range_picker;

import com.avito.android.trx_promo_impl.date_range_picker.mvi.k;
import com.avito.android.trx_promo_impl.date_range_picker.mvi.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TrxPromoDateRangePickerViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f304018a;

    public f(l lVar) {
        this.f304018a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f304018a.get();
        i2.f411430a.getClass();
        return new e(kVar, i2.a.f411433c);
    }
}
