package com.avito.android.loyalty.links.badges;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BadgeBarShowLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f183227a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f183228b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f183229c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f183230d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.loyalty.ui.badge_details.h f183231e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.loyalty.ui.badge_details.f f183232f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f183233g;

    public f(dv.b bVar, dv.b bVar2, dv.b bVar3, Provider provider, com.avito.android.loyalty.ui.badge_details.h hVar, com.avito.android.loyalty.ui.badge_details.f fVar, dagger.internal.f fVar2) {
        this.f183227a = bVar;
        this.f183228b = bVar2;
        this.f183229c = bVar3;
        this.f183230d = provider;
        this.f183231e = hVar;
        this.f183232f = fVar;
        this.f183233g = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.g gVar = (a.g) this.f183227a.get();
        a.i iVar = (a.i) this.f183228b.get();
        a.d dVar = (a.d) this.f183229c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f183230d.get();
        com.avito.android.loyalty.ui.badge_details.g gVar2 = (com.avito.android.loyalty.ui.badge_details.g) this.f183231e.get();
        this.f183232f.getClass();
        return new e(gVar, iVar, dVar, interfaceC35745a5, gVar2, new com.avito.android.loyalty.ui.badge_details.e(), (com.avito.android.deeplink_handler.handler.composite.a) this.f183233g.get());
    }
}
