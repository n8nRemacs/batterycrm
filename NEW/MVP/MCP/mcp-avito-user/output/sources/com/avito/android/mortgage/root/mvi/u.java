package com.avito.android.mortgage.root.mvi;

import Y00.InterfaceC18246g;
import com.avito.android.mortgage.root.mvi.domain.G;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32694h;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32697k;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32700n;
import com.avito.android.mortgage.root.mvi.domain.K;
import com.avito.android.mortgage.root.mvi.domain.N;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: MortgageRootActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.root.mvi.domain.z> f203342a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.root.mvi.domain.t> f203343b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32687a> f203344c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC32700n> f203345d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC32694h> f203346e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC32697k> f203347f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.root.mvi.domain.D> f203348g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<K> f203349h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<G> f203350i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.mortgage.root.mvi.domain.q> f203351j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.u f203352k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC18246g> f203353l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<R0> f203354m;

    public u(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.u uVar, Provider provider11, Provider provider12) {
        this.f203342a = provider;
        this.f203343b = provider2;
        this.f203344c = provider3;
        this.f203345d = provider4;
        this.f203346e = provider5;
        this.f203347f = provider6;
        this.f203348g = provider7;
        this.f203349h = provider8;
        this.f203350i = provider9;
        this.f203351j = provider10;
        this.f203352k = uVar;
        this.f203353l = provider11;
        this.f203354m = provider12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f203342a.get(), this.f203343b.get(), this.f203344c.get(), this.f203345d.get(), this.f203346e.get(), this.f203347f.get(), this.f203348g.get(), this.f203349h.get(), this.f203350i.get(), this.f203351j.get(), (N) this.f203352k.get(), this.f203353l.get(), this.f203354m.get());
    }
}
