package com.avito.android.advertising.adapter.items.avito;

import Db.InterfaceC13381a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44739c;

/* compiled from: AvitoNetworkImagePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44739c> f87148a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87149b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87150c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87151d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87152e;

    public g(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f87148a = provider;
        this.f87149b = uVar;
        this.f87150c = uVar2;
        this.f87151d = uVar3;
        this.f87152e = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f87148a);
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f87149b.get();
        com.avito.android.advertising.ui.i iVar = (com.avito.android.advertising.ui.i) this.f87150c.get();
        return new f((InterfaceC13381a) this.f87152e.get(), (com.avito.android.advertising.loaders.event_service.c) this.f87151d.get(), iVar, aVar, eVarB);
    }
}
