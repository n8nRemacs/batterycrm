package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.perf_const.JobCvActualizationBottomSheetDialogScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxActualizationBottomSheetModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f131478a;

    public d(l lVar) {
        this.f131478a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f131478a.f393949a;
        c.f131477a.getClass();
        return new C28478k(JobCvActualizationBottomSheetDialogScreen.f131529d, rVar, "JobCvActualizationBottomSheetContent");
    }
}
