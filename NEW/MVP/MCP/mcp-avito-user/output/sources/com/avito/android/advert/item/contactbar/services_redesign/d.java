package com.avito.android.advert.item.contactbar.services_redesign;

import com.avito.android.C29640d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesContactBarRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f74912a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f74913b;

    public d(u uVar, Provider provider) {
        this.f74912a = uVar;
        this.f74913b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.advert.item.contactbar.c) this.f74912a.get(), this.f74913b.get());
    }
}
