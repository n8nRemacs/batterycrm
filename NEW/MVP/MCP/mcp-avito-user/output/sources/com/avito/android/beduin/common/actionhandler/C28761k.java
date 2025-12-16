package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinAddComponentsToBeginningActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28761k implements dagger.internal.h<C28759j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100269a;

    public C28761k(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100269a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28759j(this.f100269a.get());
    }
}
