package com.avito.android.beduin.common.component.grid_snippet;

import Cr.InterfaceC13346a;
import bj.InterfaceC25659b;
import com.avito.android.beduin.di.C28856s;
import com.avito.android.favorite.n;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinGridSnippetComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13346a> f101409a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f101410b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.b> f101411c;

    /* renamed from: d, reason: collision with root package name */
    public final d f101412d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<n> f101413e;

    /* renamed from: f, reason: collision with root package name */
    public final C28856s f101414f;

    public g(Provider provider, Provider provider2, Provider provider3, d dVar, Provider provider4, C28856s c28856s) {
        this.f101409a = provider;
        this.f101410b = provider2;
        this.f101411c = provider3;
        this.f101412d = dVar;
        this.f101413e = provider4;
        this.f101414f = c28856s;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f101409a.get(), this.f101410b.get(), this.f101411c.get(), (c) this.f101412d.get(), this.f101413e.get(), (com.avito.android.constructor_advert.ui.serp.constructor.f) this.f101414f.get());
    }
}
