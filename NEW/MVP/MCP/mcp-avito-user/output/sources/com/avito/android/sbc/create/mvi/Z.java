package com.avito.android.sbc.create.mvi;

import com.avito.android.C30566f2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import javax.inject.Provider;

/* compiled from: CreateDiscountDispatchActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class Z implements dagger.internal.h<C34469a> {

    /* renamed from: a, reason: collision with root package name */
    public final I0 f259526a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.sbc.di.w f259527b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.sbc.create.c> f259528c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f259529d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.sbc.di.v f259530e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C30566f2> f259531f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f259532g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f259533h;

    /* renamed from: i, reason: collision with root package name */
    public final Oo0.m f259534i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f259535j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f259536k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.sbc.create.mvi.util.h f259537l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<AK0.l> f259538m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f259539n;

    public Z(I0 i02, com.avito.android.sbc.di.w wVar, Provider provider, dagger.internal.l lVar, com.avito.android.sbc.di.v vVar, Provider provider2, Provider provider3, Provider provider4, Oo0.m mVar, Provider provider5, Provider provider6, com.avito.android.sbc.create.mvi.util.h hVar, Provider provider7, dagger.internal.u uVar) {
        this.f259526a = i02;
        this.f259527b = wVar;
        this.f259528c = provider;
        this.f259529d = lVar;
        this.f259530e = vVar;
        this.f259531f = provider2;
        this.f259532g = provider3;
        this.f259533h = provider4;
        this.f259534i = mVar;
        this.f259535j = provider5;
        this.f259536k = provider6;
        this.f259537l = hVar;
        this.f259538m = provider7;
        this.f259539n = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34469a((H0) this.f259526a.get(), (com.avito.android.sbc.utils.a) this.f259527b.get(), this.f259528c.get(), (CreateDiscountDispatchArg) this.f259529d.f393949a, (com.avito.android.sbc.utils.g) this.f259530e.get(), this.f259531f.get(), this.f259532g.get(), this.f259533h.get(), (Oo0.k) this.f259534i.get(), this.f259535j.get(), this.f259536k.get(), (com.avito.android.sbc.create.mvi.util.g) this.f259537l.get(), this.f259538m.get(), (ScreenPerformanceTracker) this.f259539n.get());
    }
}
