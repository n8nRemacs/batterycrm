package com.avito.android.authorization.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: RestorePasswordSyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class i0 implements dagger.internal.h<h0> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f93790a;

    /* renamed from: b, reason: collision with root package name */
    public final Zd.l f93791b;

    public i0(Zd.l lVar, dv.b bVar) {
        this.f93790a = bVar;
        this.f93791b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h0((Zd.i) this.f93791b.get(), (a.InterfaceC4053a) this.f93790a.get());
    }
}
