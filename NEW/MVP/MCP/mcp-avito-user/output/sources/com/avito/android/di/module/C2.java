package com.avito.android.di.module;

import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: CheckRequestModule_ProvideTimeDiffAnalyticsInterceptorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C2 implements dagger.internal.h<com.avito.android.service.short_task.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f143868a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.a> f143869b;

    public C2(Provider<Gson> provider, Provider<com.avito.android.server_time.a> provider2) {
        this.f143868a = provider;
        this.f143869b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f143868a.get();
        com.avito.android.server_time.a aVar = this.f143869b.get();
        B2 b22 = B2.f143846a;
        return new com.avito.android.service.short_task.o(aVar, gson);
    }
}
