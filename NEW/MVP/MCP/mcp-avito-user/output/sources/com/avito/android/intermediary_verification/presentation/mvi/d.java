package com.avito.android.intermediary_verification.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IntermediaryVerificationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f173178a;

    public d(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f173178a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f173178a.get());
    }
}
