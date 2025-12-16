package com.avito.android.developments_advice.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSellerOrdersRangeScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConsultationFormModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f136063a;

    /* renamed from: b, reason: collision with root package name */
    public final l f136064b;

    public h(g gVar, l lVar) {
        this.f136063a = gVar;
        this.f136064b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f136064b.f393949a;
        this.f136063a.getClass();
        return new C28478k(StrSellerOrdersRangeScreen.f90521d, rVar, null, 4, null);
    }
}
