package com.avito.android.tariff_lf_publication.level.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_publication.TariffLfPublicationLevelScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationLevelModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300907a;

    public h(l lVar) {
        this.f300907a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f300907a.f393949a;
        g.f300906a.getClass();
        return new C28478k(TariffLfPublicationLevelScreen.f300706d, rVar, null, 4, null);
    }
}
