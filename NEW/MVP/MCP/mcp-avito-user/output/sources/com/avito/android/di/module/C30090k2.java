package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import com.avito.android.retrofit.H;

/* compiled from: BuildDependenciesModule_ProvideNetworkOnMainThreadCheckerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.k2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30090k2 implements dagger.internal.h<com.avito.android.retrofit.H> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144359a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.S f144360b;

    public C30090k2(dagger.internal.l lVar, com.avito.android.S s5) {
        this.f144359a = lVar;
        this.f144360b = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144359a.f393949a;
        this.f144360b.get();
        C29980a2.f144226a.getClass();
        H.a aVarH = interfaceC29905l.h();
        dagger.internal.t.d(aVarH);
        return aVarH;
    }
}
