package com.avito.android.tariff_lf_publication.count.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationCountBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.count.domain.d f300823a;

    public e(com.avito.android.tariff_lf_publication.count.domain.d dVar) {
        this.f300823a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.tariff_lf_publication.count.domain.c) this.f300823a.get());
    }
}
