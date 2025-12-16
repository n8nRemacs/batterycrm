package com.avito.android.passport.profile_switch;

import android.content.res.Resources;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportSwitchProfileAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f213696a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f213697b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f213698c;

    /* renamed from: d, reason: collision with root package name */
    public final o f213699d;

    /* renamed from: e, reason: collision with root package name */
    public final C25721c f213700e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f213701f;

    /* renamed from: g, reason: collision with root package name */
    public final Xu.c f213702g;

    /* renamed from: h, reason: collision with root package name */
    public final b f213703h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f213704i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<R0> f213705j;

    public k(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, o oVar, C25721c c25721c, dv.b bVar3, Xu.c cVar, b bVar4, Provider provider, Provider provider2) {
        this.f213696a = fVar;
        this.f213697b = bVar;
        this.f213698c = bVar2;
        this.f213699d = oVar;
        this.f213700e = c25721c;
        this.f213701f = bVar3;
        this.f213702g = cVar;
        this.f213703h = bVar4;
        this.f213704i = provider;
        this.f213705j = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f213696a.get();
        a.g gVar = (a.g) this.f213697b.get();
        a.i iVar = (a.i) this.f213698c.get();
        l lVar = (l) this.f213699d.get();
        C25719a c25719a = (C25719a) this.f213700e.get();
        a.d dVar = (a.d) this.f213701f.get();
        Resources resources = (Resources) this.f213702g.get();
        this.f213703h.getClass();
        return new j(aVar, gVar, iVar, lVar, c25719a, dVar, resources, new a(), this.f213704i.get(), this.f213705j.get());
    }
}
