package com.avito.android.fees_methods.screen.fees_by_package.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.fees_methods.screen.fees_by_package.ui.FeesByPackagePerformanceScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesByPackageModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f157998a;

    public j(l lVar) {
        this.f157998a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f157998a.f393949a;
        i.f157997a.getClass();
        return new C28478k(FeesByPackagePerformanceScreen.f158080d, rVar, null, 4, null);
    }
}
