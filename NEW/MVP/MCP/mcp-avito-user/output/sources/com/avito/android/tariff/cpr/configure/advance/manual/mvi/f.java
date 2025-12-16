package com.avito.android.tariff.cpr.configure.advance.manual.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CprConfigureAdvanceManualBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295426a;

    public f(u uVar) {
        this.f295426a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.tariff.cpr.configure.advance.manual.mvi.domain.a) this.f295426a.get());
    }
}
