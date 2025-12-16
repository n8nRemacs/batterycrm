package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinRunUntilLimitActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class P0 implements dagger.internal.h<O0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Hh.e> f100112a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100113b;

    public P0(dagger.internal.f fVar, Provider provider) {
        this.f100112a = provider;
        this.f100113b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O0(this.f100112a.get(), dagger.internal.g.b(this.f100113b));
    }
}
