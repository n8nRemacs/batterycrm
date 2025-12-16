package com.avito.android.authorization.auto_recovery.recovery_availability.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.RecoveryAvailabilityScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecoveryAvailabilityModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f93293a;

    /* renamed from: b, reason: collision with root package name */
    public final l f93294b;

    public e(d dVar, l lVar) {
        this.f93293a = dVar;
        this.f93294b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f93294b.f393949a;
        this.f93293a.getClass();
        return new C28478k(RecoveryAvailabilityScreen.f90458d, rVar, null, 4, null);
    }
}
