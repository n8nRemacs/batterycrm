package com.avito.android.messenger.di;

import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideSessionProvider$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class C1 implements dagger.internal.h<ru.avito.messenger.C0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195611a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f195612b;

    public C1(U0 u02, Provider<com.avito.android.account.G> provider) {
        this.f195611a = u02;
        this.f195612b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.G g12 = this.f195612b.get();
        this.f195611a.getClass();
        return new com.avito.android.messenger.service.h(g12);
    }
}
