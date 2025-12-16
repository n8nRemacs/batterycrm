package com.avito.android.publish.free_delivery.domain;

import com.avito.android.publish.C0;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import dl0.InterfaceC39749a;
import javax.inject.Provider;

/* compiled from: FreeDeliveryDetailsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f235790a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f235791b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f235792c;

    public c(Provider<C0> provider, Provider<InterfaceC39749a> provider2, Provider<R0> provider3) {
        this.f235790a = provider;
        this.f235791b = provider2;
        this.f235792c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f235790a.get(), this.f235791b.get(), this.f235792c.get());
    }
}
