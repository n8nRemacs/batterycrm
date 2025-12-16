package com.avito.android.authorization.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: LoginAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final l90.q f93694a;

    /* renamed from: b, reason: collision with root package name */
    public final Zd.l f93695b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f93696c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f93697d;

    public J(l90.q qVar, Zd.l lVar, dv.b bVar, dv.b bVar2) {
        this.f93694a = qVar;
        this.f93695b = lVar;
        this.f93696c = bVar;
        this.f93697d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I((l90.o) this.f93694a.get(), (Zd.i) this.f93695b.get(), (a.InterfaceC4053a) this.f93696c.get(), (a.b) this.f93697d.get());
    }
}
