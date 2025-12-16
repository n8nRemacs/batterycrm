package com.avito.android.short_term_rent.promo_codes.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSoftBookingPromoCodesScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSoftBookingPromoCodesModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f282432a;

    public e(l lVar) {
        this.f282432a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f282432a.f393949a;
        d.f282431a.getClass();
        return new C28478k(StrSoftBookingPromoCodesScreen.f90523d, rVar, null, 4, null);
    }
}
