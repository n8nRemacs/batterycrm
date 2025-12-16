package com.avito.android.authorization.reset_password.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ResetPasswordScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ResetPasswordPerfModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final e f94166a;

    /* renamed from: b, reason: collision with root package name */
    public final l f94167b;

    public f(e eVar, l lVar) {
        this.f94166a = eVar;
        this.f94167b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f94167b.f393949a;
        this.f94166a.getClass();
        return new C28478k(ResetPasswordScreen.f90463d, rVar, "resetPasswordAttempt");
    }
}
