package com.avito.android.bxcontent.di.module;

import javax.inject.Provider;
import js0.InterfaceC42421a;

/* compiled from: BxContentModule_ProvideMiniMenuShowingAnalyticsFilter$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class H implements dagger.internal.h<com.avito.android.bxcontent.analytics.q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42421a> f110892a;

    public H(Provider<InterfaceC42421a> provider) {
        this.f110892a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42421a interfaceC42421a = this.f110892a.get();
        C29070s.f111022a.getClass();
        return new com.avito.android.bxcontent.analytics.q(interfaceC42421a);
    }
}
