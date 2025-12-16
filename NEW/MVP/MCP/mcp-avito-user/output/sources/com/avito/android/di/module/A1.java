package com.avito.android.di.module;

import com.avito.android.di.component.InterfaceC29905l;
import p91.InterfaceC46925b;

/* compiled from: AvitoAppWebSocketReporterModule_ProvideWebSocketReporterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A1 implements dagger.internal.h<InterfaceC46925b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30253z1 f143815a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f143816b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.S f143817c;

    public A1(C30253z1 c30253z1, dagger.internal.l lVar, com.avito.android.S s5) {
        this.f143815a = c30253z1;
        this.f143816b = lVar;
        this.f143817c = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29905l interfaceC29905l = (InterfaceC29905l) this.f143816b.f393949a;
        this.f143817c.get();
        this.f143815a.getClass();
        return interfaceC29905l.e();
    }
}
