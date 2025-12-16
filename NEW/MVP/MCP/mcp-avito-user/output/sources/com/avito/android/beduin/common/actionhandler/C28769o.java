package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinApplyTransformActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28769o implements dagger.internal.h<C28767n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100292a;

    public C28769o(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100292a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28767n(this.f100292a.get());
    }
}
