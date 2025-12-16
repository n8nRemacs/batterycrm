package com.avito.android.campaigns_sale.counter;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import vm.InterfaceC49347b;

/* compiled from: CampaignsSaleCounterInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113865a;

    public b(u uVar) {
        this.f113865a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC49347b) this.f113865a.get());
    }
}
