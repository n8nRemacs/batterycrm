package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import android.content.res.Resources;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: IacCanRecallLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<XL.a> f168581a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f168582b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f168583c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f168584d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168585e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f168586f;

    /* renamed from: g, reason: collision with root package name */
    public final Xu.c f168587g;

    public e(Provider provider, C25721c c25721c, dagger.internal.f fVar, dv.b bVar, Provider provider2, Provider provider3, Xu.c cVar) {
        this.f168581a = provider;
        this.f168582b = c25721c;
        this.f168583c = fVar;
        this.f168584d = bVar;
        this.f168585e = provider2;
        this.f168586f = provider3;
        this.f168587g = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f168581a.get(), (C25719a) this.f168582b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f168583c.get(), (a.g) this.f168584d.get(), this.f168585e.get(), this.f168586f.get(), (Resources) this.f168587g.get());
    }
}
