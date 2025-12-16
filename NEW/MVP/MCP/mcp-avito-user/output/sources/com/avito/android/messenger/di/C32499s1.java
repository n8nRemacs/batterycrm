package com.avito.android.messenger.di;

/* compiled from: MessengerModule_ProvideMessengerErrorResolverFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.s1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32499s1 implements dagger.internal.h<com.avito.android.remote.analytics.messenger.b> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196290a;

    public C32499s1(U0 u02) {
        this.f196290a = u02;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f196290a.getClass();
        return new ru.avito.messenger.internal.E();
    }
}
