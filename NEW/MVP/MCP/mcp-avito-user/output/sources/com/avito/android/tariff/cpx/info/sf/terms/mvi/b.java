package com.avito.android.tariff.cpx.info.sf.terms.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoSfTermsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.sf.terms.domain.b f296899a;

    public b(com.avito.android.tariff.cpx.info.sf.terms.domain.b bVar) {
        this.f296899a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.tariff.cpx.info.sf.terms.domain.a) this.f296899a.get());
    }
}
