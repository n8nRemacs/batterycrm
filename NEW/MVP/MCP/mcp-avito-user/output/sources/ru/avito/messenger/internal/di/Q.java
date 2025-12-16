package ru.avito.messenger.internal.di;

import ru.avito.messenger.A0;

/* compiled from: WebSocketMessengerTransportModule_ProvideRequestIdHolderProvider$_avito_discouraged_messengerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class Q implements dagger.internal.h<A0> {

    /* renamed from: a, reason: collision with root package name */
    public final J f431562a;

    public Q(J j12) {
        this.f431562a = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f431562a.getClass();
        return new A0();
    }
}
