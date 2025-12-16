package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinAddComponentsBeforeModelActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28757i implements dagger.internal.h<C28754h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100252a;

    public C28757i(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100252a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28754h(this.f100252a.get());
    }
}
