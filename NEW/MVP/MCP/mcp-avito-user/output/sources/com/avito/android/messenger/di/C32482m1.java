package com.avito.android.messenger.di;

import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideLogLevel$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.m1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32482m1 implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196133a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f196134b;

    public C32482m1(U0 u02, Provider<com.avito.android.util.C> provider) {
        this.f196133a = u02;
        this.f196134b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f196134b.get();
        this.f196133a.getClass();
        c12.o().getClass();
        return 0;
    }
}
