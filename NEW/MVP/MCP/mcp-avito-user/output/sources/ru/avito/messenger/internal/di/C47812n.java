package ru.avito.messenger.internal.di;

import java.lang.reflect.Proxy;
import javax.inject.Provider;
import l91.C43605a;
import m91.InterfaceC43936c;
import ru.avito.messenger.MessengerApiService;

/* compiled from: HttpMessengerTransportModule_ProvideHttpMessengerApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47812n implements dagger.internal.h<MessengerApiService> {

    /* renamed from: a, reason: collision with root package name */
    public final C47808j f431651a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Class<? extends MessengerApiService>> f431652b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f431653c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C43605a> f431654d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC43936c> f431655e;

    public C47812n(C47808j c47808j, Provider provider, dagger.internal.u uVar, Provider provider2, Provider provider3) {
        this.f431651a = c47808j;
        this.f431652b = provider;
        this.f431653c = uVar;
        this.f431654d = provider2;
        this.f431655e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Class<? extends MessengerApiService> cls = this.f431652b.get();
        com.avito.android.jsonrpc.client.b bVar = (com.avito.android.jsonrpc.client.b) this.f431653c.get();
        C43605a c43605a = this.f431654d.get();
        InterfaceC43936c interfaceC43936c = this.f431655e.get();
        this.f431651a.getClass();
        MessengerApiService messengerApiService = (MessengerApiService) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new com.avito.android.jsonrpc.client.c(cls, bVar, c43605a, new com.avito.android.jsonrpc.client.d(cls, bVar, c43605a, new C47809k(interfaceC43936c)).f174728c));
        dagger.internal.t.d(messengerApiService);
        return messengerApiService;
    }
}
