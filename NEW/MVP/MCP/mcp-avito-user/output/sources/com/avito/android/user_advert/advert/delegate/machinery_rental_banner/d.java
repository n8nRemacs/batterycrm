package com.avito.android.user_advert.advert.delegate.machinery_rental_banner;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MachineryRentalBannerDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308671a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.items.machinery_rental_banner.d f308672b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308673c;

    public d(u uVar, com.avito.android.user_advert.advert.items.machinery_rental_banner.d dVar, u uVar2) {
        this.f308671a = uVar;
        this.f308672b = dVar;
        this.f308673c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.deeplink_handler.handler.composite.a) this.f308671a.get(), (com.avito.android.user_advert.advert.items.machinery_rental_banner.c) this.f308672b.get(), (R0) this.f308673c.get());
    }
}
