package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: ServerTimeModule_ProvideUtcTimeSource$_common_server_time_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.x9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30239x9 implements dagger.internal.h<com.avito.android.server_time.j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f144708a;

    public C30239x9(Provider<com.avito.android.server_time.f> provider) {
        this.f144708a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = this.f144708a.get();
        C30163q9.f144550a.getClass();
        return new com.avito.android.server_time.j(fVar);
    }
}
