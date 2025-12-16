package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinPersistCounterActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class B0 implements dagger.internal.h<A0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.storage.d> f100051a;

    public B0(Provider<com.avito.android.beduin.common.storage.d> provider) {
        this.f100051a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A0(this.f100051a.get());
    }
}
