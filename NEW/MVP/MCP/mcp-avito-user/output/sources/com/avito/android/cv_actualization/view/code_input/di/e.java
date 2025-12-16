package com.avito.android.cv_actualization.view.code_input.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cv_actualization.perf_const.JobCvPhoneActualizationCodeInputScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvActualizationCodeInputModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131165a;

    public e(l lVar) {
        this.f131165a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f131165a.f393949a;
        d.f131164a.getClass();
        return new C28478k(JobCvPhoneActualizationCodeInputScreen.f131102d, rVar, "jobCvPhoneActualizationCodeInput");
    }
}
