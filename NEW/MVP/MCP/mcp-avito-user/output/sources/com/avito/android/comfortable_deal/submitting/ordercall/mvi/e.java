package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import Yo.t;
import Yo.v;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrderCallActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.domain.f f123062a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f123063b;

    /* renamed from: c, reason: collision with root package name */
    public final v f123064c;

    public e(com.avito.android.comfortable_deal.domain.f fVar, Provider provider, v vVar) {
        this.f123062a = fVar;
        this.f123063b = provider;
        this.f123064c = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.comfortable_deal.domain.e) this.f123062a.get(), this.f123063b.get(), (t) this.f123064c.get());
    }
}
