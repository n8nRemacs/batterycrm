package com.avito.android.autoteka.presentation.directPurchase.mvi;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaDirectPurchaseActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97297a;

    public c(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f97297a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f97297a.get());
    }
}
