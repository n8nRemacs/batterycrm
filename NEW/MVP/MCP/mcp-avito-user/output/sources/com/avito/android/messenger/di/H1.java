package com.avito.android.messenger.di;

import javax.inject.Provider;

/* compiled from: MessengerModule_ProviderUserIdTokenActualizer$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H1 implements dagger.internal.h<ru.avito.messenger.H0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195639a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f195640b;

    public H1(U0 u02, Provider<com.avito.android.messenger.w0> provider) {
        this.f195639a = u02;
        this.f195640b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.w0 w0Var = this.f195640b.get();
        this.f195639a.getClass();
        return new W0(w0Var);
    }
}
