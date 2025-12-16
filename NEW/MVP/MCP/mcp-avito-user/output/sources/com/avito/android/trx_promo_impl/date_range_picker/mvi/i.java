package com.avito.android.trx_promo_impl.date_range_picker.mvi;

import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLinkContent;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoDateRangePickerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f304051a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f304052b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f304053c;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f304051a = lVar;
        this.f304052b = lVar2;
        this.f304053c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((TrxPromoConfigureDateRangePickerLinkContent) this.f304051a.f393949a, (String) this.f304052b.f393949a, (String) this.f304053c.f393949a);
    }
}
