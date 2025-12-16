package com.avito.android.publish.details.di;

import com.avito.android.publish.analytics.InterfaceC33535v;

/* compiled from: PublishDetailsListModule_ProvideInstantMarketValuePresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class U implements dagger.internal.h<com.avito.android.publish.slots.imv.item.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f233654a;

    public U(dagger.internal.u uVar) {
        this.f233654a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33535v interfaceC33535v = (InterfaceC33535v) this.f233654a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.imv.item.d(interfaceC33535v);
    }
}
