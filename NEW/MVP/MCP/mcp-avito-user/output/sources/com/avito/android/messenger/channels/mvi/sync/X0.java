package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import javax.inject.Provider;

/* compiled from: MessengerSuccessRateTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class X0 implements dagger.internal.h<W0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f188415a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MessengerStatsdEventFactory> f188416b;

    public X0(dagger.internal.f fVar, Provider provider) {
        this.f188415a = fVar;
        this.f188416b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W0((InterfaceC28373a) this.f188415a.get(), this.f188416b.get());
    }
}
