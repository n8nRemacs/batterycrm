package com.avito.android.messenger.channels.mvi.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.graphite_counter.ChatListLoadingResult;
import com.avito.android.messenger.channels.mvi.di.C;
import javax.inject.Provider;

/* compiled from: ChannelsModule_ProvideChatListLoadingTimerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<com.avito.android.analytics.timer.a<ChatListLoadingResult>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f187441a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f187442b;

    public u(Provider<InterfaceC28373a> provider, Provider<com.avito.android.server_time.a> provider2) {
        this.f187441a = provider;
        this.f187442b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((C.c.C31718a) this.f187441a).get();
        com.avito.android.server_time.a aVar = (com.avito.android.server_time.a) ((C.c.u) this.f187442b).get();
        r.f187438a.getClass();
        return new CY.f(aVar, interfaceC28373a);
    }
}
