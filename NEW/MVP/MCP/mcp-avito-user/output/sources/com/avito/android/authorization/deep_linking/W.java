package com.avito.android.authorization.deep_linking;

import android.content.res.Resources;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PerformResetPasswordAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class W implements dagger.internal.h<S> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f93722a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f93723b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f93724c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f93725d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f93726e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.authorization.reset_password.j f93727f;

    /* renamed from: g, reason: collision with root package name */
    public final Xu.c f93728g;

    public W(Provider provider, dv.b bVar, dv.b bVar2, dv.b bVar3, dagger.internal.f fVar, com.avito.android.authorization.reset_password.j jVar, Xu.c cVar) {
        this.f93722a = provider;
        this.f93723b = bVar;
        this.f93724c = bVar2;
        this.f93725d = bVar3;
        this.f93726e = fVar;
        this.f93727f = jVar;
        this.f93728g = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S(this.f93722a.get(), (a.g) this.f93723b.get(), (a.i) this.f93724c.get(), (a.d) this.f93725d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f93726e.get(), (com.avito.android.authorization.reset_password.c) this.f93727f.get(), (Resources) this.f93728g.get());
    }
}
