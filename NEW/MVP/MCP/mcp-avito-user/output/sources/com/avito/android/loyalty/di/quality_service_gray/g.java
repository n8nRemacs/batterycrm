package com.avito.android.loyalty.di.quality_service_gray;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.loyalty.di.quality_service_gray.a;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayArgs;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QualityServiceGrayModule_ProvideEventHandler$_avito_loyalty_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<IW.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f183206a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f183207b;

    /* renamed from: c, reason: collision with root package name */
    public final l f183208c;

    public g(l lVar, Provider provider, Provider provider2) {
        this.f183206a = provider;
        this.f183207b = provider2;
        this.f183208c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((a.c.C5376a) this.f183206a).get();
        com.avito.android.analytics.provider.a aVar = (com.avito.android.analytics.provider.a) ((a.c.b) this.f183207b).get();
        QualityServiceGrayArgs qualityServiceGrayArgs = (QualityServiceGrayArgs) this.f183208c.f393949a;
        d.f183202a.getClass();
        return new IW.a(interfaceC28373a, aVar, qualityServiceGrayArgs.f184050c);
    }
}
