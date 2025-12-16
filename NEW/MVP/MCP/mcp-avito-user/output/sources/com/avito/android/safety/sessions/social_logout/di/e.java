package com.avito.android.safety.sessions.social_logout.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.SessionsSocialLogoutScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SessionsSocialLogoutModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f258021a;

    /* renamed from: b, reason: collision with root package name */
    public final l f258022b;

    public e(d dVar, l lVar) {
        this.f258021a = dVar;
        this.f258022b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f258022b.f393949a;
        this.f258021a.getClass();
        return new C28478k(SessionsSocialLogoutScreen.f90491d, rVar, "deleteOtherSessions");
    }
}
