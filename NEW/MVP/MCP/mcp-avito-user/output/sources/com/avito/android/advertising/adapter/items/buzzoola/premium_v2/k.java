package com.avito.android.advertising.adapter.items.buzzoola.premium_v2;

import Db.InterfaceC13381a;
import com.avito.android.util.Kundle;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ob.InterfaceC44739c;

/* compiled from: BuzzoolaPremiumV2PresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44739c> f87477a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87478b;

    /* renamed from: c, reason: collision with root package name */
    public final u f87479c;

    /* renamed from: d, reason: collision with root package name */
    public final u f87480d;

    /* renamed from: e, reason: collision with root package name */
    public final u f87481e;

    /* renamed from: f, reason: collision with root package name */
    public final u f87482f;

    public k(Provider provider, dagger.internal.l lVar, u uVar, u uVar2, u uVar3, u uVar4) {
        this.f87477a = provider;
        this.f87478b = lVar;
        this.f87479c = uVar;
        this.f87480d = uVar2;
        this.f87481e = uVar3;
        this.f87482f = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.b(this.f87477a), (Kundle) this.f87478b.f393949a, (com.avito.android.advertising.loaders.event_service.c) this.f87479c.get(), (com.avito.android.advertising.ui.i) this.f87480d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f87481e.get(), (InterfaceC13381a) this.f87482f.get());
    }
}
