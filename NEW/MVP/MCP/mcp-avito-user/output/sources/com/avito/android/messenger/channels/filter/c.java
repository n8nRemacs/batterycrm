package com.avito.android.messenger.channels.filter;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelsFilterAnalyticsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f187149a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<F> f187150b;

    public c(Provider<InterfaceC28373a> provider, Provider<F> provider2) {
        this.f187149a = provider;
        this.f187150b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f187149a.get(), this.f187150b.get());
    }
}
