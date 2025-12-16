package com.avito.android.authorization.auto_recovery.require_tfa.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.RequireTfaScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RequireTfaModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f93319a;

    /* renamed from: b, reason: collision with root package name */
    public final l f93320b;

    public e(d dVar, l lVar) {
        this.f93319a = dVar;
        this.f93320b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f93320b.f393949a;
        this.f93319a.getClass();
        return new C28478k(RequireTfaScreen.f90462d, rVar, null, 4, null);
    }
}
