package com.avito.android.trx_promo_impl.date_range_picker.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerApplyLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoDateRangePickerDeeplinkMappingsModule_ProvideDateRangePickerApplyMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.date_range_picker.deeplink.b f304014a;

    public e(com.avito.android.trx_promo_impl.date_range_picker.deeplink.b bVar) {
        this.f304014a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f304013a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoConfigureDateRangePickerApplyLink.class, new com.avito.android.trx_promo_impl.date_range_picker.deeplink.c(), new C43834a.b.C11809b(this.f304014a));
    }
}
