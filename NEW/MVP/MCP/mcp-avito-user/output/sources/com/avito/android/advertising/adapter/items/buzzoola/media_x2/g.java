package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import Db.InterfaceC13381a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaMediaX2PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44739c> f87341a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87342b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87343c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87344d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87345e;

    public g(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f87341a = provider;
        this.f87342b = uVar;
        this.f87343c = uVar2;
        this.f87344d = uVar3;
        this.f87345e = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f87341a);
        com.avito.android.advertising.loaders.event_service.c cVar = (com.avito.android.advertising.loaders.event_service.c) this.f87342b.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f87343c.get();
        return new f((InterfaceC13381a) this.f87345e.get(), cVar, (com.avito.android.advertising.ui.i) this.f87344d.get(), aVar, eVarB);
    }
}
