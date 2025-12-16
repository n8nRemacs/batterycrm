package com.avito.android.trx_promo_impl.date_range_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.trx_promo_impl.TrxPromoDateRangePickerScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoDateRangePickerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f304017a;

    public h(l lVar) {
        this.f304017a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f304017a.f393949a;
        g.f304016a.getClass();
        return new C28478k(TrxPromoDateRangePickerScreen.f303860d, rVar, null, 4, null);
    }
}
