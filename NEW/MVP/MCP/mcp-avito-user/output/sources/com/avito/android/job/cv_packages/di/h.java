package com.avito.android.job.cv_packages.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CvPackagesScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvPackagesTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f174362a;

    public h(l lVar) {
        this.f174362a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f174362a.f393949a;
        g.f174361a.getClass();
        return new C28478k(CvPackagesScreen.f90334d, rVar, "contactPackageList");
    }
}
