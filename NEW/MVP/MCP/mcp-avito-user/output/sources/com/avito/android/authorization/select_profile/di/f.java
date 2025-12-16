package com.avito.android.authorization.select_profile.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.SelectProfileScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectProfileModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f94323a;

    public f(l lVar) {
        this.f94323a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f94323a.f393949a;
        d.f94321a.getClass();
        return new C28478k(SelectProfileScreen.f90481d, rVar, "accountsAttempt");
    }
}
