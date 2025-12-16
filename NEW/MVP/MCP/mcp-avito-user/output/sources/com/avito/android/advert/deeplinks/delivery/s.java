package com.avito.android.advert.deeplinks.delivery;

import bk0.InterfaceC25671a;
import com.avito.android.remote.B;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RequestDeliveryInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f68970a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25671a> f68971b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f68972c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f68973d;

    public s(Provider provider, Provider provider2, com.avito.android.remote.error.i iVar, Provider provider3) {
        this.f68970a = provider;
        this.f68971b = provider2;
        this.f68972c = iVar;
        this.f68973d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(dagger.internal.g.b(this.f68970a), dagger.internal.g.b(this.f68971b), (com.avito.android.remote.error.f) this.f68972c.get(), this.f68973d.get());
    }
}
