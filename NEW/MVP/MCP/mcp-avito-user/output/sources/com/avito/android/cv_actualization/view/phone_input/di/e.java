package com.avito.android.cv_actualization.view.phone_input.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cv_actualization.perf_const.JobCvPhoneActualizationPhoneInputScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationPhoneInputModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131272a;

    public e(l lVar) {
        this.f131272a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f131272a.f393949a;
        d.f131271a.getClass();
        return new C28478k(JobCvPhoneActualizationPhoneInputScreen.f131103d, rVar, "jobCvPhoneActualizationPhoneInput");
    }
}
