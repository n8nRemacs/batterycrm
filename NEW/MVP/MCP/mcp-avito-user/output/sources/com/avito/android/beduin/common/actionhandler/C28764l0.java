package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinOpenLocalDeeplinkActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.l0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28764l0 implements dagger.internal.h<C28762k0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f100275a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.local_deeplink.e> f100276b;

    public C28764l0(dagger.internal.u uVar, Provider provider) {
        this.f100275a = uVar;
        this.f100276b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28762k0((com.avito.android.beduin.common.local_deeplink.b) this.f100275a.get(), this.f100276b.get());
    }
}
