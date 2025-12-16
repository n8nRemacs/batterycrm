package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import com.avito.android.util.C35882r3;
import com.avito.android.util.InterfaceC35940s3;

/* compiled from: AvitoAppDebugInterceptorsModule_ProvideImageOkHttpInjectorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.q1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30155q1 implements dagger.internal.h<InterfaceC35940s3> {

    /* renamed from: a, reason: collision with root package name */
    public final C30133o1 f144534a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144535b;

    public C30155q1(C30133o1 c30133o1, dagger.internal.l lVar) {
        this.f144534a = c30133o1;
        this.f144535b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144535b.f393949a;
        this.f144534a.getClass();
        C35882r3 c35882r3L = interfaceC29905l.l();
        dagger.internal.t.d(c35882r3L);
        return c35882r3L;
    }
}
