package com.avito.android.iac_problems.impl_module.deeplink.miui;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.x;
import dagger.internal.y;
import jJ.InterfaceC42261a;
import javax.inject.Provider;
import nM.InterfaceC44291a;
import pM.InterfaceC46977a;

/* compiled from: IacMiuiDisplayOnLockedScreenPermissionLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f168737a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f168738b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC44291a> f168739c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f168740d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f168741e;

    /* renamed from: f, reason: collision with root package name */
    public final C35868p2 f168742f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f168743g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<F> f168744h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.f f168745i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<k> f168746j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<PL.a> f168747k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC42261a> f168748l;

    public g(dv.b bVar, dv.b bVar2, Provider provider, Provider provider2, dv.b bVar3, C35868p2 c35868p2, Provider provider3, Provider provider4, dagger.internal.f fVar, Provider provider5, Provider provider6, Provider provider7) {
        this.f168737a = bVar;
        this.f168738b = bVar2;
        this.f168739c = provider;
        this.f168740d = provider2;
        this.f168741e = bVar3;
        this.f168742f = c35868p2;
        this.f168743g = provider3;
        this.f168744h = provider4;
        this.f168745i = fVar;
        this.f168746j = provider5;
        this.f168747k = provider6;
        this.f168748l = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.f) this.f168737a.get(), (a.d) this.f168738b.get(), this.f168739c.get(), this.f168740d.get(), (a.InterfaceC4053a) this.f168741e.get(), (InterfaceC35845m2) this.f168742f.get(), this.f168743g.get(), this.f168744h.get(), (InterfaceC28373a) this.f168745i.get(), this.f168746j.get(), this.f168747k.get(), this.f168748l.get());
    }
}
