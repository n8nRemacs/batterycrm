package ru.avito.messenger.internal.di;

import java.lang.reflect.Proxy;
import javax.inject.Provider;
import l91.C43605a;
import m91.InterfaceC43936c;
import ru.avito.messenger.MessengerApiService;

/* compiled from: WebSocketMessengerTransportModule_ProvideWebSocketTransportApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class V implements dagger.internal.h<MessengerApiService> {

    /* renamed from: a, reason: collision with root package name */
    public final J f431578a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.jsonrpc.client.b<com.google.gson.i>> f431579b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43605a> f431580c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC43936c> f431581d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f431582e;

    public V(J j12, Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar) {
        this.f431578a = j12;
        this.f431579b = provider;
        this.f431580c = provider2;
        this.f431581d = provider3;
        this.f431582e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.jsonrpc.client.b<com.google.gson.i> bVar = this.f431579b.get();
        C43605a c43605a = this.f431580c.get();
        InterfaceC43936c interfaceC43936c = this.f431581d.get();
        Class cls = (Class) this.f431582e.get();
        this.f431578a.getClass();
        MessengerApiService messengerApiService = (MessengerApiService) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new com.avito.android.jsonrpc.client.c(cls, bVar, c43605a, new com.avito.android.jsonrpc.client.d(cls, bVar, c43605a, new O(interfaceC43936c)).f174728c));
        dagger.internal.t.d(messengerApiService);
        return messengerApiService;
    }
}
