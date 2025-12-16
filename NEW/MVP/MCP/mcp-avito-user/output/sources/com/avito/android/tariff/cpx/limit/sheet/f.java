package com.avito.android.tariff.cpx.limit.sheet;

import com.avito.android.tariff.cpx.limit.sheet.mvi.k;
import com.avito.android.tariff.cpx.limit.sheet.mvi.m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLimitViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final m f297294a;

    public f(m mVar) {
        this.f297294a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((k) this.f297294a.get(), null, 2, null);
    }
}
