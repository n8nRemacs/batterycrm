package com.avito.android.comfortable_deal.submitting.promo.mvi;

import Yo.t;
import Yo.v;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.domain.f f123166a;

    /* renamed from: b, reason: collision with root package name */
    public final v f123167b;

    public e(com.avito.android.comfortable_deal.domain.f fVar, v vVar) {
        this.f123166a = fVar;
        this.f123167b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.comfortable_deal.domain.e) this.f123166a.get(), (t) this.f123167b.get());
    }
}
