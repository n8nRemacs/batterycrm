package com.avito.android.authorization.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: RequireTfaRecoverySyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class e0 implements dagger.internal.h<d0> {

    /* renamed from: a, reason: collision with root package name */
    public final Zd.l f93768a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f93769b;

    public e0(Zd.l lVar, dv.b bVar) {
        this.f93768a = lVar;
        this.f93769b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d0((Zd.i) this.f93768a.get(), (a.InterfaceC4053a) this.f93769b.get());
    }
}
