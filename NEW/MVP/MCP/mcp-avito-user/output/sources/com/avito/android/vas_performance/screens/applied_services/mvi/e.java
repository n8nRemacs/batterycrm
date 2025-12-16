package com.avito.android.vas_performance.screens.applied_services.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliedServicesBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.applied_services.domain.b f320270a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f320271b;

    public e(com.avito.android.vas_performance.screens.applied_services.domain.b bVar, Provider provider) {
        this.f320270a = bVar;
        this.f320271b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.vas_performance.screens.applied_services.domain.a) this.f320270a.get(), this.f320271b.get());
    }
}
