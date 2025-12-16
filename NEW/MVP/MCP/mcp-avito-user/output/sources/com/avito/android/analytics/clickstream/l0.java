package com.avito.android.analytics.clickstream;

import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: SendClickStreamEventsTaskDelegateImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class l0 implements dagger.internal.h<k0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f89814a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32896n> f89815b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f89816c;

    public l0(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f89814a = uVar;
        this.f89815b = provider;
        this.f89816c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k0((H) this.f89814a.get(), this.f89815b.get(), this.f89816c.get());
    }
}
