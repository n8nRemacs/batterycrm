package com.avito.android.messenger.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.di.C32453l0;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideChatAppendCounterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32492q implements dagger.internal.h<CY.k> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196222a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f196223b;

    public C32492q(C32431e c32431e, Provider<InterfaceC28373a> provider) {
        this.f196222a = c32431e;
        this.f196223b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C32453l0.b.C32455c) this.f196223b).get();
        this.f196222a.getClass();
        return new CY.a(interfaceC28373a);
    }
}
