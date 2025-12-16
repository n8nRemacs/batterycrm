package com.avito.android.hotel_available_rooms.konveyor.promo_widget;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelPromoWidgetPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<GI.a> f163059a;

    /* renamed from: b, reason: collision with root package name */
    public final l f163060b;

    public e(l lVar, Provider provider) {
        this.f163059a = provider;
        this.f163060b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f163059a.get(), (Y41.l) this.f163060b.f393949a);
    }
}
