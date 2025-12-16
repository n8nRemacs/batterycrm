package com.avito.android.di.module;

import JK0.e;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: AppAttributedTextFormatterModule_ProvideErrorHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K0 implements dagger.internal.h<e.a> {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f144024a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f144025b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f144026c;

    public K0(J0 j02, dagger.internal.f fVar, Provider provider) {
        this.f144024a = j02;
        this.f144025b = fVar;
        this.f144026c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144025b.get();
        com.avito.android.util.C c12 = this.f144026c.get();
        this.f144024a.getClass();
        return new I0(interfaceC28373a, c12);
    }
}
