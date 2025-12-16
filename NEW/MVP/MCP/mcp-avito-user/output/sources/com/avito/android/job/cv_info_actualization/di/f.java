package com.avito.android.job.cv_info_actualization.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.job.cv_info_actualization.perf_const.JobCvInfoActualizationScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvInfoActualizationModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f174074a;

    public f(l lVar) {
        this.f174074a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f174074a.f393949a;
        e.f174073a.getClass();
        return new C28478k(JobCvInfoActualizationScreen.f174192d, rVar, "jobCVActualize");
    }
}
