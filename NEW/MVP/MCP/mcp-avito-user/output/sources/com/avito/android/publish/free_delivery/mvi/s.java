package com.avito.android.publish.free_delivery.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: FreeDeliveryReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f235868a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f235869b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f235870c;

    public s(Provider<InterfaceC28373a> provider, Provider<C0> provider2, Provider<C50213a> provider3) {
        this.f235868a = provider;
        this.f235869b = provider2;
        this.f235870c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f235868a.get(), this.f235869b.get(), this.f235870c.get());
    }
}
