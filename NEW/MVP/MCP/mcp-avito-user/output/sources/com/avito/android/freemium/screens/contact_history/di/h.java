package com.avito.android.freemium.screens.contact_history.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.freemium.screens.contact_history.FreemiumContactHistoryPerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreemiumContactHistoryModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f158972a;

    public h(l lVar) {
        this.f158972a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f158972a.f393949a;
        g.f158971a.getClass();
        return new C28478k(FreemiumContactHistoryPerfScreen.f158948d, rVar, null, 4, null);
    }
}
