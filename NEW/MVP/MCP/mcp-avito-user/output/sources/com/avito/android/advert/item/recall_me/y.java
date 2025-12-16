package com.avito.android.advert.item.recall_me;

import com.avito.android.util.R0;
import javax.inject.Provider;
import t7.InterfaceC48510a;
import u7.C48810a;

/* compiled from: RecallMeBlockPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class y implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f78555a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.b f78556b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.recall_me.domain.n> f78557c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f78558d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<j> f78559e;

    /* renamed from: f, reason: collision with root package name */
    public final F f78560f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f78561g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f78562h;

    public y(Provider provider, u7.b bVar, Provider provider2, dagger.internal.u uVar, Provider provider3, F f12, dagger.internal.f fVar, Provider provider4) {
        this.f78555a = provider;
        this.f78556b = bVar;
        this.f78557c = provider2;
        this.f78558d = uVar;
        this.f78559e = provider3;
        this.f78560f = f12;
        this.f78561g = fVar;
        this.f78562h = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f78555a.get(), (C48810a) this.f78556b.get(), this.f78557c.get(), (InterfaceC28167d) this.f78558d.get(), this.f78559e.get(), (E) this.f78560f.get(), (InterfaceC48510a) this.f78561g.get(), this.f78562h.get());
    }
}
