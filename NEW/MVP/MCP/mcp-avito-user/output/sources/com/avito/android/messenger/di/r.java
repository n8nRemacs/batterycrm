package com.avito.android.messenger.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.graphite_counter.ChatLoadingResult;
import com.avito.android.messenger.di.C32453l0;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideChatLoadingTimerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<com.avito.android.analytics.timer.a<ChatLoadingResult>> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f196283a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f196284b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f196285c;

    public r(C32431e c32431e, Provider<InterfaceC28373a> provider, Provider<com.avito.android.server_time.a> provider2) {
        this.f196283a = c32431e;
        this.f196284b = provider;
        this.f196285c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C32453l0.b.C32455c) this.f196284b).get();
        com.avito.android.server_time.a aVar = (com.avito.android.server_time.a) ((C32453l0.b.D) this.f196285c).get();
        this.f196283a.getClass();
        return new CY.h(aVar, interfaceC28373a);
    }
}
