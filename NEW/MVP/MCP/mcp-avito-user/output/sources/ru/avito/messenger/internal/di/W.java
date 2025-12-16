package ru.avito.messenger.internal.di;

import Oq.InterfaceC14725a;
import com.google.gson.Gson;
import javax.inject.Provider;
import ru.avito.messenger.api.entity.MessengerResponse;

/* compiled from: WebSocketMessengerTransportModule_ProvideWebsocketMessageParserFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class W implements dagger.internal.h<ru.avito.websocket.A<MessengerResponse>> {

    /* renamed from: a, reason: collision with root package name */
    public final J f431583a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f431584b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f431585c;

    public W(J j12, Provider provider, dagger.internal.u uVar) {
        this.f431583a = j12;
        this.f431584b = provider;
        this.f431585c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f431584b.get();
        InterfaceC14725a interfaceC14725a = (InterfaceC14725a) this.f431585c.get();
        this.f431583a.getClass();
        return new ru.avito.messenger.internal.H(gson, interfaceC14725a);
    }
}
