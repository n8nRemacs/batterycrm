package com.avito.android.user_adverts.root_screen.adverts_host.header.mvi;

import com.avito.android.Z0;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F;
import com.avito.android.user_adverts.root_screen.adverts_host.j0;
import com.avito.android.user_adverts.root_screen.adverts_host.k0;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import uI0.InterfaceC48905a;

/* compiled from: ProfileHeaderMviViewModelComposite_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<JI0.a> f312765a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<FI0.a> f312766b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<F> f312767c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a> f312768d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a> f312769e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a> f312770f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC48905a> f312771g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b> f312772h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f312773i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<R0> f312774j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<Z0> f312775k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.user_adverts.root_screen.adverts_host.delivery_restriction.a> f312776l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<e0> f312777m;

    public p(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, k0 k0Var, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        this.f312765a = provider;
        this.f312766b = provider2;
        this.f312767c = provider3;
        this.f312768d = provider4;
        this.f312769e = provider5;
        this.f312770f = provider6;
        this.f312771g = provider7;
        this.f312772h = provider8;
        this.f312773i = k0Var;
        this.f312774j = provider9;
        this.f312775k = provider10;
        this.f312776l = provider11;
        this.f312777m = provider12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        JI0.a aVar = this.f312765a.get();
        FI0.a aVar2 = this.f312766b.get();
        F f12 = this.f312767c.get();
        com.avito.android.user_adverts.root_screen.adverts_host.safety_info.a aVar3 = this.f312768d.get();
        com.avito.android.user_adverts.root_screen.adverts_host.charity_info.a aVar4 = this.f312769e.get();
        com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.a aVar5 = this.f312770f.get();
        InterfaceC48905a interfaceC48905a = this.f312771g.get();
        com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar = this.f312772h.get();
        this.f312773i.getClass();
        return new b(aVar, aVar2, f12, aVar3, aVar4, aVar5, interfaceC48905a, bVar, new j0(), this.f312774j.get(), this.f312775k.get(), this.f312776l.get(), this.f312777m.get());
    }
}
