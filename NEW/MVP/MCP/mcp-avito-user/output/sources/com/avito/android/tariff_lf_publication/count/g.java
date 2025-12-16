package com.avito.android.tariff_lf_publication.count;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: TariffLfPublicationCountViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.count.mvi.h f300812a;

    public g(com.avito.android.tariff_lf_publication.count.mvi.h hVar) {
        this.f300812a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_lf_publication.count.mvi.g gVar = (com.avito.android.tariff_lf_publication.count.mvi.g) this.f300812a.get();
        i2.f411430a.getClass();
        return new f(gVar, i2.a.f411433c);
    }
}
