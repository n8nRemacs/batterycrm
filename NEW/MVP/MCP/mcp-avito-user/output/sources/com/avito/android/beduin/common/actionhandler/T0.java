package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinScrollToFirstInvalidModelActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class T0 implements dagger.internal.h<S0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100133a;

    public T0(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100133a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S0(this.f100133a.get());
    }
}
