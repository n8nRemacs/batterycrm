package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinAddComponentsToEndActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28765m implements dagger.internal.h<C28763l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100279a;

    public C28765m(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100279a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28763l(this.f100279a.get());
    }
}
