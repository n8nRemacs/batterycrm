package com.avito.android.comfortable_deal.repository;

import Jp.InterfaceC14233a;
import com.avito.android.P;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import d20.C39487a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComfortableDealRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39387a> f122608a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f122609b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC14233a> f122610c;

    /* renamed from: d, reason: collision with root package name */
    public final u f122611d;

    /* renamed from: e, reason: collision with root package name */
    public final u f122612e;

    /* renamed from: f, reason: collision with root package name */
    public final u f122613f;

    public l(u uVar, u uVar2, u uVar3, Provider provider, Provider provider2, Provider provider3) {
        this.f122608a = provider;
        this.f122609b = provider2;
        this.f122610c = provider3;
        this.f122611d = uVar;
        this.f122612e = uVar2;
        this.f122613f = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.b(this.f122608a), this.f122609b.get(), this.f122610c.get(), (AK0.l) this.f122611d.get(), (P) this.f122612e.get(), (C39487a) this.f122613f.get());
    }
}
