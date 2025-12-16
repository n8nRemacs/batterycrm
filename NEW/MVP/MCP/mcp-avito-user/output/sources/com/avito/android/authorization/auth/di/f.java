package com.avito.android.authorization.auth.di;

import com.avito.android.analytics.screens.AuthScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuthModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f92933a;

    public f(dagger.internal.l lVar) {
        this.f92933a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f92933a.f393949a;
        d.f92931a.getClass();
        return new C28478k(AuthScreen.f90285d, rVar, "auth_suggestions_check");
    }
}
