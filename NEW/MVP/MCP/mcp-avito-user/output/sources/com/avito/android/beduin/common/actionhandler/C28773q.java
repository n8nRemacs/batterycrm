package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinApplyWebPaymentMessageActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28773q implements dagger.internal.h<C28771p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f100362a;

    public C28773q(Provider<com.avito.android.beduin.common.form.store.b> provider) {
        this.f100362a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28771p(this.f100362a.get());
    }
}
