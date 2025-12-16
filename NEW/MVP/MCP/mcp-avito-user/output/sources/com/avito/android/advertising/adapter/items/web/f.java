package com.avito.android.advertising.adapter.items.web;

import Db.InterfaceC13381a;
import androidx.view.InterfaceC22983P;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44739c;

/* compiled from: CommercialHtmlPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87673a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44739c> f87674b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87675c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87676d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87677e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.konveyor.item_visibility_tracker.b> f87678f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.j> f87679g;

    /* renamed from: h, reason: collision with root package name */
    public final u f87680h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f87681i;

    public f(u uVar, Provider provider, u uVar2, u uVar3, u uVar4, Provider provider2, Provider provider3, u uVar5, dagger.internal.l lVar) {
        this.f87673a = uVar;
        this.f87674b = provider;
        this.f87675c = uVar2;
        this.f87676d = uVar3;
        this.f87677e = uVar4;
        this.f87678f = provider2;
        this.f87679g = provider3;
        this.f87680h = uVar5;
        this.f87681i = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((m) this.f87673a.get(), dagger.internal.g.b(this.f87674b), (com.avito.android.advertising.loaders.event_service.c) this.f87675c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f87676d.get(), (com.avito.android.advertising.ui.i) this.f87677e.get(), this.f87678f.get(), this.f87679g.get(), (InterfaceC13381a) this.f87680h.get(), (InterfaceC22983P) this.f87681i.f393949a);
    }
}
