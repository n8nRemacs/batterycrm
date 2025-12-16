package com.avito.android.authorization.complete_registration.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CompleteRegistrationScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompleteRegistrationModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f93413a;

    public d(l lVar) {
        this.f93413a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f93413a.f393949a;
        c.f93412a.getClass();
        return new C28478k(CompleteRegistrationScreen.f90329d, rVar, "complete_reg_attempt");
    }
}
