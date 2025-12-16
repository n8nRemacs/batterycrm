package com.avito.android.cv_upload.di.cv_upload;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cv_upload.perf_const.JobCvUploadScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvUploadModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131635a;

    public d(l lVar) {
        this.f131635a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f131635a.f393949a;
        c.f131634a.getClass();
        return new C28478k(JobCvUploadScreen.f131686d, rVar, "cvUpload");
    }
}
