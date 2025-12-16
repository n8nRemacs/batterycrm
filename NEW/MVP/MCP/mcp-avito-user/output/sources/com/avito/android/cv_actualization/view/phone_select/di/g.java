package com.avito.android.cv_actualization.view.phone_select.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cv_actualization.perf_const.JobCvPhoneActualizationSelectPhoneScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationPhoneSelectModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131331a;

    public g(l lVar) {
        this.f131331a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f131331a.f393949a;
        d.f131328a.getClass();
        return new C28478k(JobCvPhoneActualizationSelectPhoneScreen.f131104d, rVar, "jobCvPhoneActualizationSelectPhone");
    }
}
