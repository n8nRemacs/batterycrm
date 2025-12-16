package com.avito.android.loyalty.di.quality_service;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.loyalty.di.quality_service.c;
import com.avito.android.loyalty.ui.quality_service.QualityServiceArgs;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceModule_ProvideEventHandler$_avito_loyalty_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<MW.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f183165a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f183166b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f183167c;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f183165a = provider;
        this.f183166b = provider2;
        this.f183167c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((c.C5373c.a) this.f183165a).get();
        com.avito.android.analytics.provider.a aVar = (com.avito.android.analytics.provider.a) ((c.C5373c.b) this.f183166b).get();
        QualityServiceArgs qualityServiceArgs = (QualityServiceArgs) this.f183167c.f393949a;
        i.f183161a.getClass();
        return new MW.a(interfaceC28373a, aVar, qualityServiceArgs.f183789c);
    }
}
