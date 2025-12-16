package ru.avito.messenger.internal.di;

import Oq.InterfaceC14725a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import m91.InterfaceC43936c;
import ru.avito.messenger.InterfaceC47839w;
import ru.avito.messenger.internal.C47745a;

/* compiled from: HttpMessengerTransportModule_ProvideHttpJsonRpcClientFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47811m implements dagger.internal.h<com.avito.android.jsonrpc.client.b<com.google.gson.i>> {

    /* renamed from: a, reason: collision with root package name */
    public final C47808j f431645a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f431646b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C47745a> f431647c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC43936c> f431648d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f431649e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC14725a> f431650f;

    public C47811m(C47808j c47808j, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f431645a = c47808j;
        this.f431646b = uVar;
        this.f431647c = provider;
        this.f431648d = provider2;
        this.f431649e = provider3;
        this.f431650f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.jsonrpc.client.b bVarC;
        ru.avito.messenger.internal.jsonrpc.b bVar = (ru.avito.messenger.internal.jsonrpc.b) this.f431646b.get();
        C47745a c47745a = this.f431647c.get();
        InterfaceC43936c interfaceC43936c = this.f431648d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f431649e.get();
        InterfaceC14725a interfaceC14725a = this.f431650f.get();
        this.f431645a.getClass();
        ru.avito.messenger.internal.jsonrpc.c cVar = new ru.avito.messenger.internal.jsonrpc.c(bVar, c47745a.f431221n, c47745a.f431224q, c47745a.f431223p, c47745a.f431229v, c47745a.f431230w, c47745a.f431209b, c47745a.f431211d, interfaceC43936c, interfaceC35745a5, interfaceC14725a);
        InterfaceC47839w interfaceC47839w = c47745a.f431220m;
        return (interfaceC47839w == null || (bVarC = interfaceC47839w.c()) == null) ? cVar : bVarC;
    }
}
