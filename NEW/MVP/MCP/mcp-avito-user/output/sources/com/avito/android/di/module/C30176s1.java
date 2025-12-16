package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import com.avito.android.util.C35882r3;
import com.avito.android.util.InterfaceC35940s3;
import okhttp3.Interceptor;

/* compiled from: AvitoAppDebugInterceptorsModule_ProvideOkHttpInjectorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.s1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30176s1 implements dagger.internal.h<InterfaceC35940s3> {

    /* renamed from: a, reason: collision with root package name */
    public final C30133o1 f144569a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144570b;

    /* renamed from: c, reason: collision with root package name */
    public final C30144p1 f144571c;

    /* renamed from: d, reason: collision with root package name */
    public final C30165r1 f144572d;

    /* renamed from: e, reason: collision with root package name */
    public final C30187t1 f144573e;

    public C30176s1(C30133o1 c30133o1, dagger.internal.l lVar, C30144p1 c30144p1, C30165r1 c30165r1, C30187t1 c30187t1) {
        this.f144569a = c30133o1;
        this.f144570b = lVar;
        this.f144571c = c30144p1;
        this.f144572d = c30165r1;
        this.f144573e = c30187t1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144570b.f393949a;
        Interceptor interceptor = (Interceptor) this.f144571c.get();
        Interceptor interceptor2 = (Interceptor) this.f144572d.get();
        Interceptor interceptor3 = (Interceptor) this.f144573e.get();
        this.f144569a.getClass();
        C35882r3 c35882r3G = interfaceC29905l.g(interceptor, interceptor2, interceptor3);
        dagger.internal.t.d(c35882r3G);
        return c35882r3G;
    }
}
