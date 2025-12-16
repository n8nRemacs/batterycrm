package com.avito.android.vas_performance.screens.applied_services.di;

import com.avito.android.analytics.screens.AppliedServicesScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppliedServicesModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final f f320239a;

    /* renamed from: b, reason: collision with root package name */
    public final l f320240b;

    public g(f fVar, l lVar) {
        this.f320239a = fVar;
        this.f320240b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f320240b.f393949a;
        this.f320239a.getClass();
        return new C28478k(AppliedServicesScreen.f90283d, rVar, null, 4, null);
    }
}
