package com.avito.android.tariff.cpx.limit.sheet.mvi;

import com.avito.android.tariff.cpx.limit.sheet.domain.TariffCpxLimitContent;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLimitBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f297331a;

    public i(dagger.internal.l lVar) {
        this.f297331a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((TariffCpxLimitContent) this.f297331a.f393949a);
    }
}
