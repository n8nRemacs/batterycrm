package com.avito.android.messenger.di;

import hz.InterfaceC41196a;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47734d0;

/* compiled from: MessengerModule_ProvideMessengerNetworkErrorRefresher$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.u1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32505u1 implements dagger.internal.h<InterfaceC47734d0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196297a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f196298b;

    public C32505u1(U0 u02, Provider<InterfaceC41196a> provider) {
        this.f196297a = u02;
        this.f196298b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC41196a interfaceC41196a = this.f196298b.get();
        this.f196297a.getClass();
        return new com.avito.android.messenger.connection.p(interfaceC41196a);
    }
}
