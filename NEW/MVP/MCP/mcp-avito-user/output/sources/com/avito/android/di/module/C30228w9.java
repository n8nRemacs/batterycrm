package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: ServerTimeModule_ProvideTimeSource$_common_server_time_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.w9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30228w9 implements dagger.internal.h<com.avito.android.server_time.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f144696a;

    public C30228w9(Provider<com.avito.android.server_time.f> provider) {
        this.f144696a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = this.f144696a.get();
        C30163q9.f144550a.getClass();
        return fVar;
    }
}
