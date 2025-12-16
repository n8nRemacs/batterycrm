package com.avito.android.advert.item.compatibility.v3;

import com.avito.android.C29640d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV3Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f74419a;

    /* renamed from: b, reason: collision with root package name */
    public final u f74420b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f74421c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<b> f74422d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C29640d> f74423e;

    public i(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f74419a = provider;
        this.f74420b = uVar;
        this.f74421c = provider2;
        this.f74422d = provider3;
        this.f74423e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f74419a.get(), (com.avito.konveyor.a) this.f74420b.get(), this.f74421c.get(), this.f74422d.get(), this.f74423e.get());
    }
}
