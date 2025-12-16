package com.avito.android.important_addresses_selection.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImportantAddressesSelectionDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f169746a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f169747b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f169748c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f169749d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f169750e;

    /* renamed from: f, reason: collision with root package name */
    public final RM.b f169751f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f169752g;

    /* renamed from: h, reason: collision with root package name */
    public final dv.b f169753h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f169754i;

    public h(Provider provider, C25721c c25721c, dagger.internal.f fVar, dv.b bVar, dv.b bVar2, RM.b bVar3, dv.b bVar4, dv.b bVar5, dagger.internal.f fVar2) {
        this.f169746a = provider;
        this.f169747b = c25721c;
        this.f169748c = fVar;
        this.f169749d = bVar;
        this.f169750e = bVar2;
        this.f169751f = bVar3;
        this.f169752g = bVar4;
        this.f169753h = bVar5;
        this.f169754i = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f169746a.get(), (C25719a) this.f169747b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169748c.get(), (a.d) this.f169749d.get(), (a.f) this.f169750e.get(), (RM.a) this.f169751f.get(), (a.g) this.f169752g.get(), (a.i) this.f169753h.get(), (InterfaceC28373a) this.f169754i.get());
    }
}
