package com.avito.android.messenger.di;

import com.avito.android.InterfaceC32900o;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideMessengerStatsdEventFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.y1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32517y1 implements dagger.internal.h<MessengerStatsdEventFactory> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196317a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f196318b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32900o> f196319c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.H> f196320d;

    public C32517y1(U0 u02, Provider<com.avito.android.util.C> provider, Provider<InterfaceC32900o> provider2, Provider<com.avito.android.analytics.H> provider3) {
        this.f196317a = u02;
        this.f196318b = provider;
        this.f196319c = provider2;
        this.f196320d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f196318b.get();
        InterfaceC32900o interfaceC32900o = this.f196319c.get();
        com.avito.android.analytics.H h12 = this.f196320d.get();
        this.f196317a.getClass();
        return new MessengerStatsdEventFactory(c12, interfaceC32900o, h12);
    }
}
