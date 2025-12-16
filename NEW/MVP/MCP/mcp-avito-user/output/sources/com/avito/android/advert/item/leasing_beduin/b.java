package com.avito.android.advert.item.leasing_beduin;

import bj.InterfaceC25659b;
import com.avito.android.advert.item.beduin.k;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsLeasingBeduinBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77347a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f77348b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.c f77349c;

    public b(u uVar, Provider provider, B4.c cVar) {
        this.f77347a = uVar;
        this.f77348b = provider;
        this.f77349c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f77347a.get(), this.f77348b.get(), (k) this.f77349c.get());
    }
}
