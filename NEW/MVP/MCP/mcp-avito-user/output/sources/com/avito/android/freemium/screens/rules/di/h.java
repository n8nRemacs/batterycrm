package com.avito.android.freemium.screens.rules.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.freemium.screens.rules.FreemiumRulesPerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreemiumRulesModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f159099a;

    public h(l lVar) {
        this.f159099a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f159099a.f393949a;
        g.f159098a.getClass();
        return new C28478k(FreemiumRulesPerfScreen.f159068d, rVar, null, 4, null);
    }
}
