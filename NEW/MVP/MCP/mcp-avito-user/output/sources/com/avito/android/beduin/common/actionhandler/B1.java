package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinValidateFormsActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class B1 implements dagger.internal.h<A1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100052a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100053b;

    public B1(dagger.internal.f fVar, Provider provider) {
        this.f100052a = provider;
        this.f100053b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A1(this.f100052a.get(), dagger.internal.g.b(this.f100053b));
    }
}
