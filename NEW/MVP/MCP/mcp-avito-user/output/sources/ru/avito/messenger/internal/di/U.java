package ru.avito.messenger.internal.di;

import Oq.InterfaceC14725a;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import javax.inject.Provider;
import m91.InterfaceC43936c;
import ru.avito.messenger.InterfaceC47839w;
import ru.avito.messenger.internal.C47745a;
import ru.avito.websocket.InterfaceC47843a;

/* compiled from: WebSocketMessengerTransportModule_ProvideWebSocketJsonRpcClientFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class U implements dagger.internal.h<com.avito.android.jsonrpc.client.b<com.google.gson.i>> {

    /* renamed from: a, reason: collision with root package name */
    public final J f431570a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47843a> f431571b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f431572c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f431573d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C47745a> f431574e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC43936c> f431575f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f431576g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC14725a> f431577h;

    public U(J j12, Provider provider, dagger.internal.u uVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f431570a = j12;
        this.f431571b = provider;
        this.f431572c = uVar;
        this.f431573d = provider2;
        this.f431574e = provider3;
        this.f431575f = provider4;
        this.f431576g = provider5;
        this.f431577h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.jsonrpc.client.b bVarB;
        InterfaceC47843a interfaceC47843a = this.f431571b.get();
        ru.avito.websocket.A a12 = (ru.avito.websocket.A) this.f431572c.get();
        Gson gson = this.f431573d.get();
        C47745a c47745a = this.f431574e.get();
        InterfaceC43936c interfaceC43936c = this.f431575f.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f431576g.get();
        InterfaceC14725a interfaceC14725a = this.f431577h.get();
        this.f431570a.getClass();
        ru.avito.messenger.internal.jsonrpc.f fVar = new ru.avito.messenger.internal.jsonrpc.f(interfaceC47843a, a12, gson, c47745a.f431212e, interfaceC43936c, interfaceC35745a5, interfaceC14725a, c47745a.f431230w, c47745a.f431231x);
        InterfaceC47839w interfaceC47839w = c47745a.f431220m;
        return (interfaceC47839w == null || (bVarB = interfaceC47839w.b()) == null) ? fVar : bVarB;
    }
}
