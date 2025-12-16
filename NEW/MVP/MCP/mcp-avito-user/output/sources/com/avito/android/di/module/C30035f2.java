package com.avito.android.di.module;

import Du.b;
import com.avito.android.di.component.InterfaceC29905l;

/* compiled from: BuildDependenciesModule_ProvideDebugDeeplinkReposFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.f2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30035f2 implements dagger.internal.h<Du.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144284a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f144285b;

    public C30035f2(dagger.internal.l lVar, C30102l3 c30102l3) {
        this.f144284a = lVar;
        this.f144285b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f144284a.f393949a;
        this.f144285b.get();
        C29980a2.f144226a.getClass();
        b.a aVarO = interfaceC29905l.o();
        dagger.internal.t.d(aVarO);
        return aVarO;
    }
}
