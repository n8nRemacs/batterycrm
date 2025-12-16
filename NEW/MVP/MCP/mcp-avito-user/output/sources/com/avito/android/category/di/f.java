package com.avito.android.category.di;

import Nn.C14593b;
import Nn.InterfaceC14592a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category.CategoryArguments;
import com.avito.android.category.di.p;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryModule_ProvideCategoryAnalyticsInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<InterfaceC14592a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f116543a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.e> f116544b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f116545c;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f116543a = provider;
        this.f116544b = provider2;
        this.f116545c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((p.c.a) this.f116543a).get();
        com.avito.android.analytics.provider.e eVar = this.f116544b.get();
        CategoryArguments categoryArguments = (CategoryArguments) this.f116545c.f393949a;
        int i12 = e.f116542a;
        return new C14593b(interfaceC28373a, eVar, categoryArguments.f116452c);
    }
}
