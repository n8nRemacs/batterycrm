package com.avito.android.tariff_lf_publication.level;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffLfPublicationLevelViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.level.mvi.i f300918a;

    public i(com.avito.android.tariff_lf_publication.level.mvi.i iVar) {
        this.f300918a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_lf_publication.level.mvi.h hVar = (com.avito.android.tariff_lf_publication.level.mvi.h) this.f300918a.get();
        i2.f411430a.getClass();
        return new h(hVar, i2.a.f411433c);
    }
}
