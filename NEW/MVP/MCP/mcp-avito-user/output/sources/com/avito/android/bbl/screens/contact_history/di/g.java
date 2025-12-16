package com.avito.android.bbl.screens.contact_history.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.bbl.screens.contact_history.BblContactHistoryPerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblContactHistoryModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f99643a;

    public g(l lVar) {
        this.f99643a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f99643a.f393949a;
        f.f99642a.getClass();
        return new C28478k(BblContactHistoryPerfScreen.f99631d, rVar, null, 4, null);
    }
}
