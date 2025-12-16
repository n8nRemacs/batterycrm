package com.avito.android.advertising.adapter.items.avito.bdui;

import Db.InterfaceC13381a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44738b;

/* compiled from: AvitoNetworkAvlBDUIPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f87041a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.ui.i> f87042b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f87043c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.event_service.c> f87044d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC13381a> f87045e;

    public f(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f87041a = lVar;
        this.f87042b = provider;
        this.f87043c = provider2;
        this.f87044d = provider3;
        this.f87045e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC44738b) this.f87041a.f393949a, this.f87042b.get(), this.f87043c.get(), this.f87044d.get(), this.f87045e.get());
    }
}
