package com.avito.android.publish.free_delivery.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: FreeDeliveryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f235848a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f235849b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f235850c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C50213a> f235851d;

    public j(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f235848a = uVar;
        this.f235849b = provider;
        this.f235850c = provider2;
        this.f235851d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.publish.free_delivery.domain.a) this.f235848a.get(), this.f235849b.get(), this.f235850c.get(), this.f235851d.get());
    }
}
