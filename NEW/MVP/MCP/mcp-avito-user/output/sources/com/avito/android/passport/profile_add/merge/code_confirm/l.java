package com.avito.android.passport.profile_add.merge.code_confirm;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportMergeCodeConfirmScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeConfirmScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f212730a;

    public l(dagger.internal.l lVar) {
        this.f212730a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f212730a.f393949a;
        k.f212729a.getClass();
        return new C28478k(PassportMergeCodeConfirmScreen.f211159d, rVar, "mergeCodeConfirm");
    }
}
