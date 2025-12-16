package com.avito.android.comfortable_deal.deal.item.mortgage;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import zp.InterfaceC50602a;

/* compiled from: MortgageBannerPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f121443a;

    /* renamed from: b, reason: collision with root package name */
    public final u f121444b;

    public h(l lVar, u uVar) {
        this.f121443a = lVar;
        this.f121444b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f121443a.f393949a, (InterfaceC50602a) this.f121444b.get());
    }
}
