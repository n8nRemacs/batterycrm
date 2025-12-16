package com.avito.android.tariff.cpx.configure.advance_manual.mvi;

import com.avito.android.tariff.remote.model.cpx.CpxConfigureAdvanceManualResult;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceManualBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f295847a;

    public g(dagger.internal.l lVar) {
        this.f295847a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((CpxConfigureAdvanceManualResult) this.f295847a.f393949a);
    }
}
