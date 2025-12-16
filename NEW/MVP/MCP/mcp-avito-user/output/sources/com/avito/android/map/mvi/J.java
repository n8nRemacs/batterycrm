package com.avito.android.map.mvi;

import aY.InterfaceC19840d;
import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.InterfaceC34333n0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: MapInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class J implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34333n0> f184960a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34323k> f184961b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f184962c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f184963d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.map.analytics.e> f184964e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.map.di.v f184965f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Set<String>> f184966g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f184967h;

    public J(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, com.avito.android.map.di.v vVar, Provider provider6, dagger.internal.u uVar) {
        this.f184960a = provider;
        this.f184961b = provider2;
        this.f184962c = provider3;
        this.f184963d = provider4;
        this.f184964e = provider5;
        this.f184965f = vVar;
        this.f184966g = provider6;
        this.f184967h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f184960a.get(), this.f184961b.get(), this.f184962c.get(), this.f184963d.get(), this.f184964e.get(), (com.avito.android.map_core.view.e) this.f184965f.get(), this.f184966g.get(), (InterfaceC19840d) this.f184967h.get());
    }
}
