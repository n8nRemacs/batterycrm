package com.avito.android.passport.profile_add.merge.accounts_profile_error;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.passport.perf_const.PassportAccountsProfileErrorScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AccountsProfileErrorScreenPerformanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f212411a;

    public g(l lVar) {
        this.f212411a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f212411a.f393949a;
        f.f212410a.getClass();
        return new C28478k(PassportAccountsProfileErrorScreen.f211153d, rVar, "passportProfileError");
    }
}
