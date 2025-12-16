package com.avito.android.authorization.login.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.LoginScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoginPerfModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f94045a;

    public h(l lVar) {
        this.f94045a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f94045a.f393949a;
        g.f94044a.getClass();
        return new C28478k(LoginScreen.f90398d, rVar, null, 4, null);
    }
}
