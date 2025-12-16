package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* compiled from: BuildDependenciesModule_ProvideCallFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.c2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30002c2 implements dagger.internal.h<Call.Factory> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144242a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144243b;

    public C30002c2(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f144242a = lVar;
        this.f144243b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144242a.f393949a;
        OkHttpClient okHttpClient = (OkHttpClient) this.f144243b.get();
        C29980a2.f144226a.getClass();
        return interfaceC29905l.c(okHttpClient);
    }
}
