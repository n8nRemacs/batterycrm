package com.avito.android.iac_dialer.impl_module.notifications.channels;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IncomingCallNotificationsChannelCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<kM.g> f166097a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<kM.f> f166098b;

    public i(Provider<kM.g> provider, Provider<kM.f> provider2) {
        this.f166097a = provider;
        this.f166098b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f166097a.get(), this.f166098b.get());
    }
}
