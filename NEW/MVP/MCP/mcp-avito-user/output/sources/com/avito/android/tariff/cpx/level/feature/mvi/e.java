package com.avito.android.tariff.cpx.level.feature.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLevelFeatureActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f296984a;

    public e(u uVar) {
        this.f296984a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((v50.g) this.f296984a.get());
    }
}
