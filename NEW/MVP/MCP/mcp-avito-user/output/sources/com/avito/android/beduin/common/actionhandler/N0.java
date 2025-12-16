package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinReplaceComponentsActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class N0 implements dagger.internal.h<M0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100103a;

    public N0(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100103a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new M0(this.f100103a.get());
    }
}
