package com.avito.android.tariff.cpx.info.sf.terms.mvi;

import com.avito.android.tariff.cpx.info.sf.terms.domain.TariffCpxInfoSfTermsContent;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoSfTermsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296901a;

    public d(l lVar) {
        this.f296901a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((TariffCpxInfoSfTermsContent) this.f296901a.f393949a);
    }
}
