package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.analytics.b;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideChannelsListUseCaseTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.b1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32424b1 implements dagger.internal.h<com.avito.android.messenger.channels.analytics.b> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195742a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f195743b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<MessengerStatsdEventFactory> f195744c;

    /* renamed from: d, reason: collision with root package name */
    public final C30713g1 f195745d;

    public C32424b1(U0 u02, dagger.internal.f fVar, Provider provider, C30713g1 c30713g1) {
        this.f195742a = u02;
        this.f195743b = fVar;
        this.f195744c = provider;
        this.f195745d = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f195743b.get();
        MessengerStatsdEventFactory messengerStatsdEventFactory = this.f195744c.get();
        C30277e1 c30277e1 = (C30277e1) this.f195745d.get();
        this.f195742a.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[40];
        Object cVar = ((Boolean) c30277e1.f144973N.a().invoke()).booleanValue() ? new com.avito.android.messenger.channels.analytics.c(interfaceC28373a, messengerStatsdEventFactory, new ru.avito.messenger.internal.E()) : b.a.f187093a;
        dagger.internal.t.d(cVar);
        return cVar;
    }
}
