package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinRemoveComponentsActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class L0 implements dagger.internal.h<K0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100100a;

    public L0(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100100a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K0(this.f100100a.get());
    }
}
