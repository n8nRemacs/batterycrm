package com.avito.android.tariff.cpx.info.advance;

import com.avito.android.tariff.cpx.info.advance.mvi.i;
import com.avito.android.tariff.cpx.info.advance.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoAdvanceViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f296331a;

    public f(j jVar) {
        this.f296331a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f296331a.get(), null, 2, null);
    }
}
