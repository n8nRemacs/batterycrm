package com.avito.android.tariff.cpx.info.sf.menu.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff.cpx.info.sf.menu.TariffCpxInfoSfMenuScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoSfMenuModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296783a;

    public f(l lVar) {
        this.f296783a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f296783a.f393949a;
        e.f296782a.getClass();
        return new C28478k(TariffCpxInfoSfMenuScreen.f296759d, rVar, null, 4, null);
    }
}
