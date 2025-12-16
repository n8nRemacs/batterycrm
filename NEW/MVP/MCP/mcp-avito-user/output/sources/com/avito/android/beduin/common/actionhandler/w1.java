package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinToggleActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class w1 implements dagger.internal.h<v1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100511a;

    public w1(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100511a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v1(this.f100511a.get());
    }
}
