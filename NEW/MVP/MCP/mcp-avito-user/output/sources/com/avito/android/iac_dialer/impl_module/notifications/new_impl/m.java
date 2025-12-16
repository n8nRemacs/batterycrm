package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacNotificationTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f166135a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<F> f166136b;

    public m(dagger.internal.f fVar, Provider provider) {
        this.f166135a = fVar;
        this.f166136b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((InterfaceC28373a) this.f166135a.get(), this.f166136b.get());
    }
}
