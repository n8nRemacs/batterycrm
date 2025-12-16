package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import com.avito.android.account.E;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.permissions.w;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacCanCallInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<IacCanCallInteractorImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_outgoing_call_ability.impl_module.api.a> f168538a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H> f168539b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168540c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168541d;

    /* renamed from: e, reason: collision with root package name */
    public final w f168542e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<MK.a> f168543f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<F> f168544g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f168545h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<E> f168546i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<g> f168547j;

    /* renamed from: k, reason: collision with root package name */
    public final u f168548k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<Gson> f168549l;

    public e(Provider provider, Provider provider2, Provider provider3, Provider provider4, w wVar, Provider provider5, Provider provider6, dagger.internal.f fVar, Provider provider7, Provider provider8, u uVar, Provider provider9) {
        this.f168538a = provider;
        this.f168539b = provider2;
        this.f168540c = provider3;
        this.f168541d = provider4;
        this.f168542e = wVar;
        this.f168543f = provider5;
        this.f168544g = provider6;
        this.f168545h = fVar;
        this.f168546i = provider7;
        this.f168547j = provider8;
        this.f168548k = uVar;
        this.f168549l = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new IacCanCallInteractorImpl(this.f168538a.get(), this.f168539b.get(), this.f168540c.get(), this.f168541d.get(), (com.avito.android.permissions.u) this.f168542e.get(), this.f168543f.get(), this.f168544g.get(), (InterfaceC28373a) this.f168545h.get(), this.f168546i.get(), this.f168547j.get(), (k) this.f168548k.get(), this.f168549l.get());
    }
}
