package com.avito.android.messenger.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.di.C32453l0;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideSuggestClickCounterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Y implements dagger.internal.h<CY.m> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195726a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f195727b;

    public Y(C32431e c32431e, Provider<InterfaceC28373a> provider) {
        this.f195726a = c32431e;
        this.f195727b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C32453l0.b.C32455c) this.f195727b).get();
        this.f195726a.getClass();
        return new CY.m(interfaceC28373a);
    }
}
