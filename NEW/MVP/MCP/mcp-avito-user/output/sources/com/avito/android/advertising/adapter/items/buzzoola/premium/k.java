package com.avito.android.advertising.adapter.items.buzzoola.premium;

import Db.InterfaceC13381a;
import com.avito.android.util.Kundle;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuzzoolaPremiumPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87421a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87422b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87423c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87424d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87425e;

    /* renamed from: f, reason: collision with root package name */
    public final u f87426f;

    public k(u uVar, dagger.internal.l lVar, u uVar2, u uVar3, u uVar4, u uVar5) {
        this.f87421a = uVar;
        this.f87422b = lVar;
        this.f87423c = uVar2;
        this.f87424d = uVar3;
        this.f87425e = uVar4;
        this.f87426f = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.b(this.f87421a), (Kundle) this.f87422b.f393949a, (com.avito.android.advertising.loaders.event_service.c) this.f87423c.get(), (com.avito.android.advertising.ui.i) this.f87424d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f87425e.get(), (InterfaceC13381a) this.f87426f.get());
    }
}
