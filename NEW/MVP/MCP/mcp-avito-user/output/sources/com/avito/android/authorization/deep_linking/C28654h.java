package com.avito.android.authorization.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import javax.inject.Provider;

/* compiled from: AuthenticateAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.authorization.deep_linking.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28654h implements dagger.internal.h<C28652f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f93782a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f93783b;

    /* renamed from: c, reason: collision with root package name */
    public final Zd.l f93784c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f93785d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f93786e;

    public C28654h(dv.b bVar, dv.b bVar2, Zd.l lVar, dagger.internal.f fVar, Provider provider) {
        this.f93782a = bVar;
        this.f93783b = bVar2;
        this.f93784c = lVar;
        this.f93785d = fVar;
        this.f93786e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28652f((a.b) this.f93782a.get(), (a.InterfaceC4053a) this.f93783b.get(), (Zd.i) this.f93784c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f93785d.get(), this.f93786e.get());
    }
}
