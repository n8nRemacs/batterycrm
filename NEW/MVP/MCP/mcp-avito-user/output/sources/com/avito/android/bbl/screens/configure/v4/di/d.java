package com.avito.android.bbl.screens.configure.v4.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblConfigureV4Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final c f99456a;

    /* renamed from: b, reason: collision with root package name */
    public final l f99457b;

    public d(c cVar, l lVar) {
        this.f99456a = cVar;
        this.f99457b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f99457b.f393949a;
        this.f99456a.getClass();
        return new C28478k(BblConfigureV4PerformanceScreen.f99455d, rVar, null, 4, null);
    }
}
