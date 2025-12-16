package com.avito.android.calltracking.deeplink;

import am.InterfaceC19907a;
import com.avito.android.analytics.H;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vN.C49237a;
import vN.C49239c;

/* compiled from: MessengerPhoneCallLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19907a> f113654a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f113655b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f113656c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f113657d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H> f113658e;

    /* renamed from: f, reason: collision with root package name */
    public final w f113659f;

    /* renamed from: g, reason: collision with root package name */
    public final C49239c f113660g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f113661h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<XL.a> f113662i;

    public f(Provider provider, dv.b bVar, dagger.internal.f fVar, Provider provider2, Provider provider3, w wVar, C49239c c49239c, dagger.internal.f fVar2, Provider provider4) {
        this.f113654a = provider;
        this.f113655b = bVar;
        this.f113656c = fVar;
        this.f113657d = provider2;
        this.f113658e = provider3;
        this.f113659f = wVar;
        this.f113660g = c49239c;
        this.f113661h = fVar2;
        this.f113662i = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f113654a.get(), (a.i) this.f113655b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f113656c.get(), this.f113657d.get(), this.f113658e.get(), (u) this.f113659f.get(), (C49237a) this.f113660g.get(), (com.avito.android.deep_linking.x) this.f113661h.get(), this.f113662i.get());
    }
}
