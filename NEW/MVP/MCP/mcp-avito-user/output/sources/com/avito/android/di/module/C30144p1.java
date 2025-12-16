package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import okhttp3.Interceptor;

/* compiled from: AvitoAppDebugInterceptorsModule_ProvideAuthenticateInterceptorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.p1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30144p1 implements dagger.internal.h<Interceptor> {

    /* renamed from: a, reason: collision with root package name */
    public final C30133o1 f144508a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144509b;

    public C30144p1(C30133o1 c30133o1, dagger.internal.l lVar) {
        this.f144508a = c30133o1;
        this.f144509b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144509b.f393949a;
        this.f144508a.getClass();
        return interfaceC29905l.d();
    }
}
