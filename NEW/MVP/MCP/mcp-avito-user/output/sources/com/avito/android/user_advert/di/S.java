package com.avito.android.user_advert.di;

import iT.InterfaceC41341a;
import iT.InterfaceC41342b;

/* compiled from: MyAdvertStatsBeduinModule_ProvideBeduinMetaStoragesProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class S implements dagger.internal.h<InterfaceC41342b> {

    /* renamed from: a, reason: collision with root package name */
    public final P f310897a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f310898b;

    public S(P p12, dagger.internal.u uVar) {
        this.f310897a = p12;
        this.f310898b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC41341a interfaceC41341a = (InterfaceC41341a) this.f310898b.get();
        this.f310897a.getClass();
        return new com.avito.android.profile.pro.impl.di.l(interfaceC41341a, 1);
    }
}
