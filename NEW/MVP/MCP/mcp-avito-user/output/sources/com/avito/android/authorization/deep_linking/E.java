package com.avito.android.authorization.deep_linking;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: AutoRecoveryAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class E implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Zd.l f93669a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f93670b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f93671c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.authorization.auto_recovery.e f93672d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f93673e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f93674f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f93675g;

    public E(Zd.l lVar, dv.b bVar, dv.b bVar2, com.avito.android.authorization.auto_recovery.e eVar, dv.b bVar3, dagger.internal.f fVar, dagger.internal.f fVar2) {
        this.f93669a = lVar;
        this.f93670b = bVar;
        this.f93671c = bVar2;
        this.f93672d = eVar;
        this.f93673e = bVar3;
        this.f93674f = fVar;
        this.f93675g = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A((Zd.i) this.f93669a.get(), (a.InterfaceC4053a) this.f93670b.get(), (a.b) this.f93671c.get(), (com.avito.android.authorization.auto_recovery.a) this.f93672d.get(), (a.g) this.f93673e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f93674f.get(), (InterfaceC28373a) this.f93675g.get());
    }
}
