package com.avito.android.comfortable_deal.end_deal.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EndDealBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f122340a;

    public h(u uVar) {
        this.f122340a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.comfortable_deal.end_deal.interactor.d) this.f122340a.get());
    }
}
