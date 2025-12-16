package com.avito.android.user_advert.di;

import cU0.C27106d;
import iT.C41343c;
import iT.InterfaceC41341a;

/* compiled from: MyAdvertStatsBeduinModule_ProvideBeduinMetaStoragesHolderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class Q implements dagger.internal.h<InterfaceC41341a> {

    /* renamed from: a, reason: collision with root package name */
    public final P f310896a;

    public Q(P p12) {
        this.f310896a = p12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f310896a.getClass();
        return new C41343c(new com.avito.beduin.v2.engine.component.x(), new C27106d());
    }
}
