package com.avito.android.tariff.cpx.info;

import com.avito.android.tariff.cpx.info.mvi.l;
import com.avito.android.tariff.cpx.info.mvi.m;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final m f296418a;

    public h(m mVar) {
        this.f296418a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((l) this.f296418a.get(), null, 2, null);
    }
}
