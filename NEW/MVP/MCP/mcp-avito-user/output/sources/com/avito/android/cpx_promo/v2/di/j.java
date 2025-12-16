package com.avito.android.cpx_promo.v2.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo.v2.CpxPromoV2PerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f127425a;

    /* renamed from: b, reason: collision with root package name */
    public final l f127426b;

    public j(i iVar, l lVar) {
        this.f127425a = iVar;
        this.f127426b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f127426b.f393949a;
        this.f127425a.getClass();
        return new C28478k(CpxPromoV2PerfScreen.f127394d, rVar, null, 4, null);
    }
}
