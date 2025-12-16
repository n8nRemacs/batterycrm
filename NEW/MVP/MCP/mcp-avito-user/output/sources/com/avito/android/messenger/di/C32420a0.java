package com.avito.android.messenger.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.di.C32453l0;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideSuggestShowCounterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.a0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32420a0 implements dagger.internal.h<CY.o> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195734a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f195735b;

    public C32420a0(C32431e c32431e, Provider<InterfaceC28373a> provider) {
        this.f195734a = c32431e;
        this.f195735b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C32453l0.b.C32455c) this.f195735b).get();
        this.f195734a.getClass();
        return new CY.o(interfaceC28373a);
    }
}
