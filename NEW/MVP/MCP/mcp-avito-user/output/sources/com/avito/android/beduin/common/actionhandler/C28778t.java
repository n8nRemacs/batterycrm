package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinAuthenticateActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28778t implements dagger.internal.h<C28776s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f100406a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100407b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f100408c;

    public C28778t(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider) {
        this.f100406a = lVar;
        this.f100407b = fVar;
        this.f100408c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28776s((com.avito.android.deeplink_handler.handler.composite.a) this.f100406a.f393949a, dagger.internal.g.b(this.f100407b), this.f100408c.get());
    }
}
