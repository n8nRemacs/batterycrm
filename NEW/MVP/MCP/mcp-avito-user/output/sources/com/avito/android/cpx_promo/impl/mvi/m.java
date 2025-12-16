package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import fs.InterfaceC40470a;
import javax.inject.Provider;

/* compiled from: CpxPromoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f127207a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f127208b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cpx_promo.impl.interactor.g f127209c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f127210d;

    /* renamed from: e, reason: collision with root package name */
    public final fs.c f127211e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f127212f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f127213g;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.cpx_promo.impl.interactor.g gVar, Provider provider, fs.c cVar, Provider provider2, Provider provider3) {
        this.f127207a = lVar;
        this.f127208b = lVar2;
        this.f127209c = gVar;
        this.f127210d = provider;
        this.f127211e = cVar;
        this.f127212f = provider2;
        this.f127213g = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((String) this.f127207a.f393949a, (String) this.f127208b.f393949a, (com.avito.android.cpx_promo.impl.interactor.a) this.f127209c.get(), this.f127210d.get(), (InterfaceC40470a) this.f127211e.get(), this.f127212f.get(), this.f127213g.get());
    }
}
