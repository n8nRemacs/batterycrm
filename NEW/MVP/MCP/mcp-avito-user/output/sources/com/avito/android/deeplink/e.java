package com.avito.android.deeplink;

import com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.l;

/* compiled from: NotificationCenterListDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final A30.d f134106a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f134107b;

    /* renamed from: c, reason: collision with root package name */
    public final f f134108c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<l<CrmNotificationCenterBeduinRedesignTestGroup>> f134109d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.counter.a> f134110e;

    public e(A30.d dVar, dv.b bVar, f fVar, Provider provider, Provider provider2) {
        this.f134106a = dVar;
        this.f134107b = bVar;
        this.f134108c = fVar;
        this.f134109d = provider;
        this.f134110e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((A30.b) this.f134106a.get(), (a.InterfaceC4053a) this.f134107b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f134108c.get(), this.f134109d.get(), this.f134110e.get());
    }
}
