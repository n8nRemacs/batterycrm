package com.avito.android.authorization.deep_linking;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: EmailUnavailableReasonAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final Zd.l f93683a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f93684b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f93685c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f93686d;

    public G(Zd.l lVar, dv.b bVar, dv.b bVar2, dagger.internal.f fVar) {
        this.f93683a = lVar;
        this.f93684b = bVar;
        this.f93685c = bVar2;
        this.f93686d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F((Zd.i) this.f93683a.get(), (a.InterfaceC4053a) this.f93684b.get(), (a.b) this.f93685c.get(), (InterfaceC28373a) this.f93686d.get());
    }
}
