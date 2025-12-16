package com.avito.android.iac_dialer_watcher.impl_module.logging;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacLogTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f167939a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<F> f167940b;

    public s(dagger.internal.f fVar, Provider provider) {
        this.f167939a = fVar;
        this.f167940b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((InterfaceC28373a) this.f167939a.get(), this.f167940b.get());
    }
}
