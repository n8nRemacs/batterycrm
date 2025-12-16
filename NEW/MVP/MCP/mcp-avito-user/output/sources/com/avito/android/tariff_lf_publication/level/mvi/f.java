package com.avito.android.tariff_lf_publication.level.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationLevelBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300933a;

    public f(u uVar) {
        this.f300933a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.tariff_lf_publication.level.domain.a) this.f300933a.get());
    }
}
