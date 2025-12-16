package com.avito.android.trx_promo_impl.date_range_picker.di;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TrxPromoDateRangePickerDeeplinkMappingsModule_ProvideDateRangePickerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.trx_promo_impl.date_range_picker.deeplink.f f304015a;

    public f(com.avito.android.trx_promo_impl.date_range_picker.deeplink.f fVar) {
        this.f304015a = fVar;
    }

    public static C43834a a(com.avito.android.trx_promo_impl.date_range_picker.deeplink.f fVar) {
        d.f304013a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TrxPromoConfigureDateRangePickerLink.class, new com.avito.android.trx_promo_impl.date_range_picker.deeplink.i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TrxPromoConfigureDateRangePickerLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f304015a);
    }
}
