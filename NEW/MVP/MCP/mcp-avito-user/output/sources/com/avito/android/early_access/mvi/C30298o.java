package com.avito.android.early_access.mvi;

import javax.inject.Provider;

/* compiled from: EarlyAccessBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.early_access.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30298o implements dagger.internal.h<C30297n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f145518a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f145519b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.early_access.u> f145520c;

    public C30298o(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f145518a = uVar;
        this.f145519b = provider;
        this.f145520c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30297n((InterfaceC30301s) this.f145518a.get(), this.f145519b.get(), this.f145520c.get());
    }
}
