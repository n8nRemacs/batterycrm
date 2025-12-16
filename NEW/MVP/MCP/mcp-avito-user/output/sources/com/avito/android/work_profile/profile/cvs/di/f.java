package com.avito.android.work_profile.profile.cvs.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.JobCvsScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvsModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f331005a;

    public f(l lVar) {
        this.f331005a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f331005a.f393949a;
        c.f331002a.getClass();
        return new C28478k(JobCvsScreen.f90389d, rVar, "cvs");
    }
}
