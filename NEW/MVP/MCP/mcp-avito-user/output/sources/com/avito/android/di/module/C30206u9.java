package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: ServerTimeModule_ProvideTimeDiffConsumer$_common_server_time_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.u9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30206u9 implements dagger.internal.h<com.avito.android.server_time.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.e> f144622a;

    public C30206u9(Provider<com.avito.android.server_time.e> provider) {
        this.f144622a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.e eVar = this.f144622a.get();
        C30163q9.f144550a.getClass();
        return eVar;
    }
}
