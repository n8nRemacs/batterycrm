package com.avito.android.advert_core.pp_recall_promo;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PpRecallPromoItemFilter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Yo.p> f84008a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f84009b;

    public s(dagger.internal.l lVar, Provider provider) {
        this.f84008a = provider;
        this.f84009b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f84008a.get(), (String) this.f84009b.f393949a);
    }
}
