package com.avito.android.gig_shift_action.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rG.InterfaceC47539a;

/* compiled from: GigShiftActionDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f160414a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f160415b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f160416c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f160417d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC47539a> f160418e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f160419f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f160420g;

    public i(dv.b bVar, dagger.internal.f fVar, C25721c c25721c, dv.b bVar2, Provider provider, dv.b bVar3, Provider provider2) {
        this.f160414a = bVar;
        this.f160415b = fVar;
        this.f160416c = c25721c;
        this.f160417d = bVar2;
        this.f160418e = provider;
        this.f160419f = bVar3;
        this.f160420g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f160414a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f160415b.get(), (C25719a) this.f160416c.get(), (a.f) this.f160417d.get(), this.f160418e.get(), (a.g) this.f160419f.get(), this.f160420g.get());
    }
}
