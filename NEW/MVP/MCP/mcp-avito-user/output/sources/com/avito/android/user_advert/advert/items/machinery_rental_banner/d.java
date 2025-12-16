package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MachineryRentalBannerInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309580a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309581b;

    public d(u uVar, u uVar2) {
        this.f309580a = uVar;
        this.f309581b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((R0) this.f309581b.get(), dagger.internal.g.a(w.a(this.f309580a)));
    }
}
