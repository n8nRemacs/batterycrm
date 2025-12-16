package com.avito.android.str_booking.ui.promo_banner;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingPromoBannerItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f286159a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f286160b;

    /* renamed from: c, reason: collision with root package name */
    public final l f286161c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f286159a = provider;
        this.f286160b = provider2;
        this.f286161c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f286159a.get(), this.f286160b.get(), (Y41.l) this.f286161c.f393949a);
    }
}
