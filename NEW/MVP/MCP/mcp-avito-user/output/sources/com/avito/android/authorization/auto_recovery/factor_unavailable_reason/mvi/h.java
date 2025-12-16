package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FactorUnavailableReasonBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f93176a;

    public h(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f93176a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f93176a.get());
    }
}
