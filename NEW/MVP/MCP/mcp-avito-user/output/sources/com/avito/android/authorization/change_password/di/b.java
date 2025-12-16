package com.avito.android.authorization.change_password.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ChangePasswordScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChangePasswordModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final a f93332a;

    /* renamed from: b, reason: collision with root package name */
    public final l f93333b;

    public b(a aVar, l lVar) {
        this.f93332a = aVar;
        this.f93333b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f93333b.f393949a;
        this.f93332a.getClass();
        return new C28478k(ChangePasswordScreen.f90317d, rVar, "change_password_attempt");
    }
}
