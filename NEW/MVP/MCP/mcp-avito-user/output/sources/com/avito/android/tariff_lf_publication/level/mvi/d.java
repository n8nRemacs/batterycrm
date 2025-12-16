package com.avito.android.tariff_lf_publication.level.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationLevelActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f300923a;

    public d(u uVar) {
        this.f300923a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.tariff_lf_publication.level.domain.a) this.f300923a.get());
    }
}
