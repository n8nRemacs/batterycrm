package com.avito.android.loyalty.di.criteria_gray;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.loyalty.di.criteria_gray.h;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayArgs;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaGrayModule_ProvideEventHandler$_avito_loyalty_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<JW.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f183081a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f183082b;

    /* renamed from: c, reason: collision with root package name */
    public final l f183083c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f183081a = provider;
        this.f183082b = provider2;
        this.f183083c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((h.b.a) this.f183081a).get();
        com.avito.android.analytics.provider.a aVar = (com.avito.android.analytics.provider.a) ((h.b.C5370b) this.f183082b).get();
        CriteriaGrayArgs criteriaGrayArgs = (CriteriaGrayArgs) this.f183083c.f393949a;
        c.f183077a.getClass();
        return new JW.a(interfaceC28373a, aVar, criteriaGrayArgs.f183581c);
    }
}
