package com.avito.android.loyalty.di.criteria;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.loyalty.di.criteria.i;
import com.avito.android.loyalty.ui.criteria.CriteriaArgs;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaModule_Companion_ProvideEventHandler$_avito_loyalty_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<JW.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f183035a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f183036b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f183037c;

    public e(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f183035a = provider;
        this.f183036b = provider2;
        this.f183037c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((i.b.a) this.f183035a).get();
        com.avito.android.analytics.provider.a aVar = (com.avito.android.analytics.provider.a) ((i.b.C5368b) this.f183036b).get();
        CriteriaArgs criteriaArgs = (CriteriaArgs) this.f183037c.f393949a;
        d.f183033a.getClass();
        return new JW.a(interfaceC28373a, aVar, criteriaArgs.f183421c);
    }
}
