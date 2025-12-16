package com.avito.android.credits;

import Ds.InterfaceC13437a;
import com.avito.android.V;
import com.avito.android.Y;
import com.avito.android.Z;
import javax.inject.Provider;

/* compiled from: CreditCalculatorPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f129047a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.advert.l> f129048b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Y> f129049c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Z> f129050d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<V> f129051e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.credits.installments.d> f129052f;

    public s(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f129047a = uVar;
        this.f129048b = provider;
        this.f129049c = provider2;
        this.f129050d = provider3;
        this.f129051e = provider4;
        this.f129052f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((InterfaceC13437a) this.f129047a.get(), this.f129048b.get(), this.f129049c.get(), this.f129050d.get(), this.f129051e.get(), this.f129052f.get());
    }
}
