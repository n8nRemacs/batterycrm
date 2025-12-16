package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.FactorUnavailableReasonScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FactorUnavailableReasonModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final j f93128a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f93129b;

    public k(j jVar, dagger.internal.l lVar) {
        this.f93128a = jVar;
        this.f93129b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f93129b.f393949a;
        this.f93128a.getClass();
        return new C28478k(FactorUnavailableReasonScreen.f90355d, rVar, null, 4, null);
    }
}
