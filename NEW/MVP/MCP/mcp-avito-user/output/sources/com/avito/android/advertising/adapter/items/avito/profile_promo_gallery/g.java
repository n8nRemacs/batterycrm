package com.avito.android.advertising.adapter.items.avito.profile_promo_gallery;

import Ab.C13005a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilePromoGalleryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f87243a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.d> f87244b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87245c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Ab.c> f87246d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C13005a> f87247e;

    public g(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f87243a = provider;
        this.f87244b = provider2;
        this.f87245c = uVar;
        this.f87246d = provider3;
        this.f87247e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f87243a.get(), this.f87244b.get(), (com.avito.konveyor.item_visibility_tracker.b) this.f87245c.get(), this.f87246d.get(), this.f87247e.get());
    }
}
