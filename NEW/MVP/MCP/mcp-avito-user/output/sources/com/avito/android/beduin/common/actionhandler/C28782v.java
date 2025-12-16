package com.avito.android.beduin.common.actionhandler;

import javax.inject.Provider;

/* compiled from: BeduinCancelRequestActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28782v implements dagger.internal.h<C28780u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.a> f100505a;

    public C28782v(Provider<com.avito.android.beduin.common.a> provider) {
        this.f100505a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28780u(this.f100505a.get());
    }
}
