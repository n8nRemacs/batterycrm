package com.avito.android.beduin.di.screen;

import Xi.C17013a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.beduin.common.action.BeduinOpenLocalDeeplinkAction;
import com.avito.android.beduin.common.action.BeduinUpdateNavbarTitleAction;
import com.avito.android.beduin.common.actionhandler.C28762k0;
import com.avito.android.beduin.common.actionhandler.C28764l0;
import com.avito.android.beduin.di.screen.p;
import com.avito.android.beduin_shared.model.action.custom.selectTab.BeduinSelectTabAction;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import javax.inject.Provider;
import kj.C42699b;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import pj.C47101d;
import zi.C50569a;
import zi.C50570b;

/* compiled from: BeduinScreenFragmentModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f103960a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f103961b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f103962c;

    /* renamed from: d, reason: collision with root package name */
    public final C28764l0 f103963d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C17013a> f103964e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.actionhandler.update_navbar_title.a> f103965f;

    /* renamed from: g, reason: collision with root package name */
    public final C50570b f103966g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f103967h;

    public f(Provider provider, Provider provider2, Provider provider3, C28764l0 c28764l0, Provider provider4, Provider provider5, C50570b c50570b, dagger.internal.l lVar) {
        this.f103960a = provider;
        this.f103961b = provider2;
        this.f103962c = provider3;
        this.f103963d = c28764l0;
        this.f103964e = provider4;
        this.f103965f = provider5;
        this.f103966g = c50570b;
        this.f103967h = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((p.b.a) this.f103960a).f103998a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((p.b.C3115b) this.f103961b).get();
        a.b bVar = (a.b) ((p.b.c) this.f103962c).get();
        C28762k0 c28762k0 = (C28762k0) this.f103963d.get();
        C17013a c17013a = this.f103964e.get();
        com.avito.android.beduin.common.actionhandler.update_navbar_title.a aVar2 = this.f103965f.get();
        C50569a c50569a = (C50569a) this.f103966g.get();
        Screen screen = (Screen) this.f103967h.f393949a;
        d.f103959a.getClass();
        return d.a.a(dVarEl, aVar, bVar, new C47101d(c50569a), C42756l.l0(new gj.f[]{new gj.f(BeduinOpenLocalDeeplinkAction.class, c28762k0), new gj.f(BeduinSelectTabAction.class, c17013a), new gj.f(BeduinUpdateNavbarTitleAction.class, aVar2)}), null, null, new C42699b(screen.f90471b, C42784z0.f406748b, "BeduinScreen", false, 8, null), 48);
    }
}
