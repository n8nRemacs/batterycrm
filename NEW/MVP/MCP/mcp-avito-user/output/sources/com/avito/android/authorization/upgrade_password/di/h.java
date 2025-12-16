package com.avito.android.authorization.upgrade_password.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.UpgradePasswordScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UpgradePasswordModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f94804a;

    public h(l lVar) {
        this.f94804a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f94804a.f393949a;
        g.f94803a.getClass();
        return new C28478k(UpgradePasswordScreen.f90540d, rVar, "passwordUpgrade");
    }
}
