package com.avito.android.comfortable_deal.end_deal.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EndDealActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f122337a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.end_deal.interactor.a> f122338b;

    public f(u uVar, Provider provider) {
        this.f122337a = uVar;
        this.f122338b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.comfortable_deal.end_deal.interactor.d) this.f122337a.get(), this.f122338b.get());
    }
}
