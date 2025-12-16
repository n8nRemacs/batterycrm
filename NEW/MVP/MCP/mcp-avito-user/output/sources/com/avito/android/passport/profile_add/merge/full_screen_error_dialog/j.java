package com.avito.android.passport.profile_add.merge.full_screen_error_dialog;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportAccountsMergeBlockingErrorScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FullScreenUserDialogScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213075a;

    public j(dagger.internal.l lVar) {
        this.f213075a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f213075a.f393949a;
        i.f213074a.getClass();
        return new C28478k(PassportAccountsMergeBlockingErrorScreen.f211151d, rVar, "accountsMergeBlockingError");
    }
}
