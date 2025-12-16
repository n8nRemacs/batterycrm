package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Provider;
import vN.C49237a;
import vN.C49239c;

/* compiled from: IacShowCallMethodsDialogSheetLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f168558a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.c f168559b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f168560c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f168561d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<F> f168562e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f168563f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.f f168564g;

    /* renamed from: h, reason: collision with root package name */
    public final C49239c f168565h;

    public A(dv.b bVar, com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.c cVar, dv.b bVar2, dagger.internal.f fVar, Provider provider, Provider provider2, dagger.internal.f fVar2, C49239c c49239c) {
        this.f168558a = bVar;
        this.f168559b = cVar;
        this.f168560c = bVar2;
        this.f168561d = fVar;
        this.f168562e = provider;
        this.f168563f = provider2;
        this.f168564g = fVar2;
        this.f168565h = c49239c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z((a.f) this.f168558a.get(), (com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.a) this.f168559b.get(), (a.d) this.f168560c.get(), (InterfaceC28373a) this.f168561d.get(), this.f168562e.get(), this.f168563f.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f168564g.get(), (C49237a) this.f168565h.get());
    }
}
