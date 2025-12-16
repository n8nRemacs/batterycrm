package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import Db.InterfaceC13381a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilePromoConstructorPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f87195a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87196b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87197c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.kebab.f> f87198d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87199e;

    public g(dagger.internal.f fVar, u uVar, u uVar2, Provider provider, u uVar3) {
        this.f87195a = fVar;
        this.f87196b = uVar;
        this.f87197c = uVar2;
        this.f87198d = provider;
        this.f87199e = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f87195a), (com.avito.android.deep_linking.x) this.f87196b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f87197c.get(), this.f87198d.get(), (InterfaceC13381a) this.f87199e.get());
    }
}
