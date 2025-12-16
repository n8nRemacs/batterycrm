package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import Qw.InterfaceC14939a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import sw.InterfaceC48423a;

/* compiled from: DealCabinetInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f137149a;

    /* renamed from: b, reason: collision with root package name */
    public final u f137150b;

    /* renamed from: c, reason: collision with root package name */
    public final u f137151c;

    public n(u uVar, u uVar2, u uVar3) {
        this.f137149a = uVar;
        this.f137150b = uVar2;
        this.f137151c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((InterfaceC48423a) this.f137149a.get(), (InterfaceC14939a) this.f137150b.get(), (R0) this.f137151c.get());
    }
}
