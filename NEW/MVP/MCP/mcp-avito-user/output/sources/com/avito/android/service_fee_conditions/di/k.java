package com.avito.android.service_fee_conditions.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.service_fee_conditions.ui.ServiceFeeConditionsPerformanceScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceFeeConditionsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f278428a;

    public k(l lVar) {
        this.f278428a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f278428a.f393949a;
        j.f278427a.getClass();
        return new C28478k(ServiceFeeConditionsPerformanceScreen.f278482d, rVar, null, 4, null);
    }
}
