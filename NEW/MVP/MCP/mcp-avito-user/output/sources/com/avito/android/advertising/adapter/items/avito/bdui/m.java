package com.avito.android.advertising.adapter.items.avito.bdui;

import Db.InterfaceC13381a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44739c;

/* compiled from: AvitoNetworkBDUIPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44739c> f87084a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87085b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87086c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87087d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87088e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.a> f87089f;

    public m(u uVar, u uVar2, u uVar3, u uVar4, Provider provider, Provider provider2) {
        this.f87084a = provider;
        this.f87085b = uVar;
        this.f87086c = uVar2;
        this.f87087d = uVar3;
        this.f87088e = uVar4;
        this.f87089f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(dagger.internal.g.b(this.f87084a), (com.avito.android.advertising.ui.i) this.f87085b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f87086c.get(), (com.avito.android.advertising.loaders.event_service.c) this.f87087d.get(), (InterfaceC13381a) this.f87088e.get(), this.f87089f.get());
    }
}
