package com.avito.android.publish;

import com.avito.android.Q1;
import com.avito.android.publish.analytics.C33537x;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.util.InterfaceC35745a5;
import hz.InterfaceC41196a;
import java.util.Map;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M0 implements dagger.internal.h<L0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.draft_onboarding.a> f231939a;

    /* renamed from: b, reason: collision with root package name */
    public final C33537x f231940b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f231941c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Q1> f231942d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f231943e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.p f231944f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f231945g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f231946h;

    public M0(Provider provider, C33537x c33537x, Provider provider2, Provider provider3, Provider provider4, dagger.internal.p pVar, dagger.internal.u uVar, Provider provider5) {
        this.f231939a = provider;
        this.f231940b = c33537x;
        this.f231941c = provider2;
        this.f231942d = provider3;
        this.f231943e = provider4;
        this.f231944f = pVar;
        this.f231945g = uVar;
        this.f231946h = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L0(this.f231939a.get(), (InterfaceC33535v) this.f231940b.get(), this.f231941c.get(), this.f231942d.get(), this.f231943e.get(), (Map) this.f231944f.get(), (com.avito.android.publish.restriction.e) this.f231945g.get(), this.f231946h.get());
    }
}
