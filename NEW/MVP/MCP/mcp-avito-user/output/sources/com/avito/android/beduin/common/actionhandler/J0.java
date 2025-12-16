package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinReloadFormActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class J0 implements dagger.internal.h<I0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100096a;

    public J0(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100096a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I0(this.f100096a.get());
    }
}
