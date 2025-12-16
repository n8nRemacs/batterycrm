package com.avito.android.safety.password_setting.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.PasswordSettingScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PasswordSettingModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f257452a;

    /* renamed from: b, reason: collision with root package name */
    public final l f257453b;

    public e(d dVar, l lVar) {
        this.f257452a = dVar;
        this.f257453b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f257453b.f393949a;
        this.f257452a.getClass();
        return new C28478k(PasswordSettingScreen.f90445d, rVar, "setPasswordAttempt");
    }
}
