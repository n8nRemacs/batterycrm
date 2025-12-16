package com.avito.android.short_term_rent.promo_codes.mvi;

import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSoftBookingPromoCodesBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f282460a;

    public e(dagger.internal.l lVar) {
        this.f282460a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((StrSoftBookingPromoCodesDialogOpenParams) this.f282460a.f393949a);
    }
}
