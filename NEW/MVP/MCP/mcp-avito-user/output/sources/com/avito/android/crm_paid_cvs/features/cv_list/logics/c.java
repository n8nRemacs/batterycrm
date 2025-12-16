package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import dt.InterfaceC39801a;
import javax.inject.Provider;

/* compiled from: CvListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39801a> f130549a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39801a> f130550b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC39801a> f130551c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f130552d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.toggle_comparison_state.n f130553e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f130554f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<E> f130555g;

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.toggle_comparison_state.n nVar, Provider provider5, Provider provider6) {
        this.f130549a = provider;
        this.f130550b = provider2;
        this.f130551c = provider3;
        this.f130552d = provider4;
        this.f130553e = nVar;
        this.f130554f = provider5;
        this.f130555g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f130549a.get(), this.f130550b.get(), this.f130551c.get(), this.f130552d.get(), (com.avito.android.toggle_comparison_state.l) this.f130553e.get(), this.f130554f.get(), this.f130555g.get());
    }
}
