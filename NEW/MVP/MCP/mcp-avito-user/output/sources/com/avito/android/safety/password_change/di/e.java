package com.avito.android.safety.password_change.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.PasswordChangeScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PasswordChangeModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f257276a;

    /* renamed from: b, reason: collision with root package name */
    public final l f257277b;

    public e(d dVar, l lVar) {
        this.f257276a = dVar;
        this.f257277b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f257277b.f393949a;
        this.f257276a.getClass();
        return new C28478k(PasswordChangeScreen.f90444d, rVar, "passwordChangeAttempt");
    }
}
