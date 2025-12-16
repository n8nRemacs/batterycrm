package com.avito.android.messenger.di;

import hz.InterfaceC41196a;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: MessengerModule_ProvideMessengerSessionRefresher$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.x1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32514x1 implements dagger.internal.h<ru.avito.messenger.j0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196311a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.session_refresh.l> f196312b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<OkHttpClient> f196313c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f196314d;

    public C32514x1(U0 u02, Provider<com.avito.android.session_refresh.l> provider, Provider<OkHttpClient> provider2, Provider<InterfaceC41196a> provider3) {
        this.f196311a = u02;
        this.f196312b = provider;
        this.f196313c = provider2;
        this.f196314d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.session_refresh.l lVar = this.f196312b.get();
        h31.e eVarB = dagger.internal.g.b(this.f196313c);
        h31.e eVarB2 = dagger.internal.g.b(this.f196314d);
        this.f196311a.getClass();
        return new com.avito.android.messenger.connection.n(lVar, eVarB, eVarB2);
    }
}
