package com.avito.android.authorization.deep_linking;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: RegisterAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class b0 implements dagger.internal.h<Z> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f93749a;

    /* renamed from: b, reason: collision with root package name */
    public final Zd.l f93750b;

    /* renamed from: c, reason: collision with root package name */
    public final l90.q f93751c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f93752d;

    public b0(dv.b bVar, Zd.l lVar, l90.q qVar, dagger.internal.f fVar) {
        this.f93749a = bVar;
        this.f93750b = lVar;
        this.f93751c = qVar;
        this.f93752d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Z((a.InterfaceC4053a) this.f93749a.get(), (Zd.i) this.f93750b.get(), (l90.o) this.f93751c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f93752d.get());
    }
}
