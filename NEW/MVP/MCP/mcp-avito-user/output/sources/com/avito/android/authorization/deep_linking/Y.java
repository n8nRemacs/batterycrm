package com.avito.android.authorization.deep_linking;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PhoneUnavailableReasonAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final Zd.l f93736a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f93737b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f93738c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f93739d;

    public Y(Zd.l lVar, dv.b bVar, dv.b bVar2, dagger.internal.f fVar) {
        this.f93736a = lVar;
        this.f93737b = bVar;
        this.f93738c = bVar2;
        this.f93739d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X((Zd.i) this.f93736a.get(), (a.InterfaceC4053a) this.f93737b.get(), (a.b) this.f93738c.get(), (InterfaceC28373a) this.f93739d.get());
    }
}
