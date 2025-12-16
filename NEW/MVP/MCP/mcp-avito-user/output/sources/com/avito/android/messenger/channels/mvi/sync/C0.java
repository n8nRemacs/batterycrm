package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import javax.inject.Provider;

/* compiled from: MessengerActionTimestampTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class C0 implements dagger.internal.h<B0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f188317a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MessengerStatsdEventFactory> f188318b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f188319c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f188320d;

    public C0(dagger.internal.f fVar, Provider provider, dagger.internal.f fVar2, Provider provider2) {
        this.f188317a = fVar;
        this.f188318b = provider;
        this.f188319c = fVar2;
        this.f188320d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B0((ru.avito.messenger.V) this.f188317a.get(), this.f188318b.get(), (InterfaceC28373a) this.f188319c.get(), this.f188320d.get());
    }
}
