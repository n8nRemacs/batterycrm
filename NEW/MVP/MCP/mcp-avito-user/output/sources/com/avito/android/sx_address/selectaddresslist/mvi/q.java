package com.avito.android.sx_address.selectaddresslist.mvi;

import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectAddressListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final n f294152a;

    /* renamed from: b, reason: collision with root package name */
    public final i f294153b;

    /* renamed from: c, reason: collision with root package name */
    public final s f294154c;

    /* renamed from: d, reason: collision with root package name */
    public final u f294155d;

    public q(n nVar, i iVar, s sVar, u uVar) {
        this.f294152a = nVar;
        this.f294153b = iVar;
        this.f294154c = sVar;
        this.f294155d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f294152a.get();
        h hVar = (h) this.f294153b.get();
        this.f294154c.getClass();
        r rVar = new r();
        this.f294155d.getClass();
        t tVar = new t();
        SelectAddressListState.f294108d.getClass();
        return new p("SelectAddressList", SelectAddressListState.f294109e, new o(mVar, hVar, tVar, rVar));
    }
}
