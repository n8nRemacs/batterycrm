package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinAddComponentsAfterModelActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28751g implements dagger.internal.h<C28748f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100242a;

    public C28751g(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100242a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28748f(this.f100242a.get());
    }
}
