package com.avito.android.beduin.common.component.serp_layout;

import Cr.InterfaceC13346a;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.beduin.di.C28856s;
import com.avito.android.constructor_advert.ui.serp.constructor.m;
import com.avito.android.favorite.n;
import com.avito.android.serp.adapter.n1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpLayoutFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C36135w2> f102620a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f102621b;

    /* renamed from: c, reason: collision with root package name */
    public final c f102622c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<n> f102623d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<n1> f102624e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC13346a> f102625f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f102626g;

    /* renamed from: h, reason: collision with root package name */
    public final C28856s f102627h;

    /* renamed from: i, reason: collision with root package name */
    public final u f102628i;

    public j(Provider provider, Provider provider2, c cVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6, C28856s c28856s, u uVar) {
        this.f102620a = provider;
        this.f102621b = provider2;
        this.f102622c = cVar;
        this.f102623d = provider3;
        this.f102624e = provider4;
        this.f102625f = provider5;
        this.f102626g = provider6;
        this.f102627h = c28856s;
        this.f102628i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f102620a.get(), this.f102621b.get(), (b) this.f102622c.get(), this.f102623d.get(), this.f102624e.get(), this.f102625f.get(), this.f102626g.get(), (com.avito.android.constructor_advert.ui.serp.constructor.f) this.f102627h.get(), (m) this.f102628i.get());
    }
}
