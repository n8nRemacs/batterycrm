package com.avito.android.short_term_rent.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSoftBookingScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.short_term_rent.di.module.k;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSoftBookingFragmentModule_Data_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f282343a;

    public l(dagger.internal.l lVar) {
        this.f282343a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f282343a.f393949a;
        k.b.f282342a.getClass();
        return new C28478k(StrSoftBookingScreen.f90524d, rVar, null, 4, null);
    }
}
