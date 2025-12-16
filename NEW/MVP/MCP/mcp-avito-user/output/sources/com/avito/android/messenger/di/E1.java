package com.avito.android.messenger.di;

import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideUserConnectionParamsProvider$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class E1 implements dagger.internal.h<ru.avito.messenger.D0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195624a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f195625b;

    public E1(U0 u02, Provider<com.avito.android.messenger.w0> provider) {
        this.f195624a = u02;
        this.f195625b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.w0 w0Var = this.f195625b.get();
        this.f195624a.getClass();
        return new V0(w0Var);
    }
}
