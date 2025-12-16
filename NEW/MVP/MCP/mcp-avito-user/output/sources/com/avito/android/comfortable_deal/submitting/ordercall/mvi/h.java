package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import Yo.t;
import Yo.v;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderCallBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.o f123086a;

    /* renamed from: b, reason: collision with root package name */
    public final v f123087b;

    public h(com.avito.android.comfortable_deal.repository.o oVar, v vVar) {
        this.f123086a = oVar;
        this.f123087b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.comfortable_deal.repository.n) this.f123086a.get(), (t) this.f123087b.get());
    }
}
