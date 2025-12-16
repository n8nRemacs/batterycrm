package com.avito.android.suggest_addresses.mvi;

import dagger.internal.x;
import dagger.internal.y;
import oA0.C44612c;

/* compiled from: SuggestAddressesFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final n f291955a;

    /* renamed from: b, reason: collision with root package name */
    public final l f291956b;

    /* renamed from: c, reason: collision with root package name */
    public final u f291957c;

    /* renamed from: d, reason: collision with root package name */
    public final s f291958d;

    public q(n nVar, l lVar, u uVar, s sVar) {
        this.f291955a = nVar;
        this.f291956b = lVar;
        this.f291957c = uVar;
        this.f291958d = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f291955a.get();
        k kVar = (k) this.f291956b.get();
        this.f291957c.getClass();
        t tVar = new t();
        this.f291958d.getClass();
        return new p("SuggestAddresses", new C44612c(null, null, null, false, false, null, 63, null), new o(mVar, kVar, tVar, new r()));
    }
}
