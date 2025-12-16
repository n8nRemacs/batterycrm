package ru.avito.messenger.internal.di;

import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: WebSocketMessengerTransportModule_ProvideWebSocketFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class T implements dagger.internal.h<ru.avito.websocket.z> {

    /* renamed from: a, reason: collision with root package name */
    public final J f431567a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OkHttpClient> f431568b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f431569c;

    public T(J j12, Provider provider, dagger.internal.u uVar) {
        this.f431567a = j12;
        this.f431568b = provider;
        this.f431569c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f431568b);
        ru.avito.websocket.l lVar = (ru.avito.websocket.l) this.f431569c.get();
        this.f431567a.getClass();
        return new ru.avito.websocket.k(eVarB, lVar);
    }
}
