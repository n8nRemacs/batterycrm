package com.avito.android.messenger.di;

import javax.inject.Provider;

/* compiled from: MessengerModule_ProviderUserIdTokenProvider$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I1 implements dagger.internal.h<ru.avito.messenger.F0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195646a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f195647b;

    public I1(U0 u02, Provider<com.avito.android.messenger.w0> provider) {
        this.f195646a = u02;
        this.f195647b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.w0 w0Var = this.f195647b.get();
        this.f195646a.getClass();
        return new X0(w0Var);
    }
}
