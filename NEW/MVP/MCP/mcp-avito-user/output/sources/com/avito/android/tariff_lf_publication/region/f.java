package com.avito.android.tariff_lf_publication.region;

import com.avito.android.tariff_lf_publication.region.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffLfPublicationRegionViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final g f301092a;

    public f(g gVar) {
        this.f301092a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_lf_publication.region.mvi.f fVar = (com.avito.android.tariff_lf_publication.region.mvi.f) this.f301092a.get();
        i2.f411430a.getClass();
        return new e(fVar, i2.a.f411433c);
    }
}
