package com.avito.android.map.view.adverts_in_pin;

import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertsInPinViewBinderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f185375a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.n> f185376b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.f> f185377c;

    /* renamed from: d, reason: collision with root package name */
    public final u f185378d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<h1> f185379e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.retry.a> f185380f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.floating_views.f> f185381g;

    public d(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f185375a = provider;
        this.f185376b = provider2;
        this.f185377c = provider3;
        this.f185378d = uVar;
        this.f185379e = provider4;
        this.f185380f = provider5;
        this.f185381g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f185375a.get(), this.f185376b.get(), this.f185377c.get(), (Y0) this.f185378d.get(), this.f185379e.get(), this.f185380f.get(), this.f185381g.get());
    }
}
