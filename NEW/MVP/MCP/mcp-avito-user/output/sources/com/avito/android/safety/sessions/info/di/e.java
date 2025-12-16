package com.avito.android.safety.sessions.info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.SessionsInfoScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SessionsInfoModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f257967a;

    /* renamed from: b, reason: collision with root package name */
    public final l f257968b;

    public e(d dVar, l lVar) {
        this.f257967a = dVar;
        this.f257968b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f257968b.f393949a;
        this.f257967a.getClass();
        return new C28478k(SessionsInfoScreen.f90490d, rVar, null, 4, null);
    }
}
