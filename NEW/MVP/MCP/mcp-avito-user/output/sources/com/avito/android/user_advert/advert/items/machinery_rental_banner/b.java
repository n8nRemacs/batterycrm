package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MachineryRentalBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309569a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309570b;

    public b(u uVar, u uVar2) {
        this.f309569a = uVar;
        this.f309570b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f309569a.get(), (R0) this.f309570b.get());
    }
}
