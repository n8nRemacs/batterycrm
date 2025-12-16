package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import okhttp3.Interceptor;

/* compiled from: AvitoAppDebugInterceptorsModule_ProvideLoggingInterceptorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.r1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30165r1 implements dagger.internal.h<Interceptor> {

    /* renamed from: a, reason: collision with root package name */
    public final C30133o1 f144553a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144554b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.S f144555c;

    public C30165r1(C30133o1 c30133o1, dagger.internal.l lVar, com.avito.android.S s5) {
        this.f144553a = c30133o1;
        this.f144554b = lVar;
        this.f144555c = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144554b.f393949a;
        com.avito.android.P p12 = (com.avito.android.P) this.f144555c.get();
        this.f144553a.getClass();
        return interfaceC29905l.a(p12);
    }
}
