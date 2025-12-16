package com.avito.android.advert.item.service_order_request;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrderRequestItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f79903a;

    /* renamed from: b, reason: collision with root package name */
    public final u f79904b;

    public i(u uVar, Provider provider) {
        this.f79903a = provider;
        this.f79904b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f79903a.get(), (W6.a) this.f79904b.get());
    }
}
