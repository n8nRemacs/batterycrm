package com.avito.android.advert_core.pp_recall_promo;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PpRecallPromoInstantItemFilter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Yo.p> f84004a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f84005b;

    public q(dagger.internal.l lVar, Provider provider) {
        this.f84004a = provider;
        this.f84005b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f84004a.get(), (String) this.f84005b.f393949a);
    }
}
