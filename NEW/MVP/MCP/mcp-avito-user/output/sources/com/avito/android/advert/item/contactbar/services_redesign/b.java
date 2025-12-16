package com.avito.android.advert.item.contactbar.services_redesign;

import com.avito.android.C29640d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsServicesContactBarGroupCRedesignBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f74906a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f74907b;

    public b(u uVar, Provider provider) {
        this.f74906a = uVar;
        this.f74907b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.advert.item.contactbar.c) this.f74906a.get(), this.f74907b.get());
    }
}
