package com.avito.android.advertising.adapter.items.buzzoola;

import Db.InterfaceC13381a;
import android.app.Activity;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nd.InterfaceC44378a;

/* compiled from: BuzzoolaPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f87504a;

    /* renamed from: b, reason: collision with root package name */
    public final u f87505b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87506c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f87507d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87508e;

    /* renamed from: f, reason: collision with root package name */
    public final u f87509f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.h f87510g;

    /* renamed from: h, reason: collision with root package name */
    public final u f87511h;

    public q(dagger.internal.f fVar, u uVar, u uVar2, dagger.internal.l lVar, u uVar3, u uVar4, dagger.internal.h hVar, u uVar5) {
        this.f87504a = fVar;
        this.f87505b = uVar;
        this.f87506c = uVar2;
        this.f87507d = lVar;
        this.f87508e = uVar3;
        this.f87509f = uVar4;
        this.f87510g = hVar;
        this.f87511h = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p(dagger.internal.g.b(this.f87504a), (com.avito.android.advertising.loaders.event_service.c) this.f87505b.get(), (InterfaceC44378a) this.f87506c.get(), (Activity) this.f87507d.f393949a, (com.avito.android.deeplink_handler.handler.composite.a) this.f87508e.get(), (com.avito.android.advertising.loaders.f) this.f87509f.get(), (com.avito.android.advertising.a) this.f87510g.get(), (InterfaceC13381a) this.f87511h.get());
    }
}
