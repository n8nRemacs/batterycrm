package com.avito.android.gig_shift_start.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import dh.InterfaceC39726b;
import javax.inject.Provider;

/* compiled from: GigShiftStartDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f160762a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f160763b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f160764c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f160765d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f160766e;

    /* renamed from: f, reason: collision with root package name */
    public final HH.b f160767f;

    /* renamed from: g, reason: collision with root package name */
    public final Yg.c f160768g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f160769h;

    public j(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, dv.b bVar3, dv.b bVar4, HH.b bVar5, Yg.c cVar, Provider provider) {
        this.f160762a = fVar;
        this.f160763b = bVar;
        this.f160764c = bVar2;
        this.f160765d = bVar3;
        this.f160766e = bVar4;
        this.f160767f = bVar5;
        this.f160768g = cVar;
        this.f160769h = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.deeplink_handler.handler.composite.a) this.f160762a.get(), (a.d) this.f160763b.get(), (a.InterfaceC4053a) this.f160764c.get(), (a.f) this.f160765d.get(), (a.b) this.f160766e.get(), (HH.a) this.f160767f.get(), (InterfaceC39726b) this.f160768g.get(), this.f160769h.get());
    }
}
