package com.avito.android.passport.profile_add.merge.profile_to_convert;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportProfileToConvertSelectionScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileToConvertScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f213135a;

    public k(dagger.internal.l lVar) {
        this.f213135a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f213135a.f393949a;
        j.f213134a.getClass();
        return new C28478k(PassportProfileToConvertSelectionScreen.f211162d, rVar, "profileToConvertSelection");
    }
}
