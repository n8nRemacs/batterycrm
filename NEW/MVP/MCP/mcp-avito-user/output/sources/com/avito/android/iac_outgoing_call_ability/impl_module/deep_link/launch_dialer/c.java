package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zL.InterfaceC50481a;

/* compiled from: IacStartNewCallLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<NK.a> f168603a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f168604b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC50481a> f168605c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<PK.a> f168606d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f168607e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<MK.a> f168608f;

    public c(Provider provider, C25721c c25721c, Provider provider2, Provider provider3, dv.b bVar, Provider provider4) {
        this.f168603a = provider;
        this.f168604b = c25721c;
        this.f168605c = provider2;
        this.f168606d = provider3;
        this.f168607e = bVar;
        this.f168608f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f168603a.get(), (C25719a) this.f168604b.get(), this.f168605c.get(), this.f168606d.get(), (a.i) this.f168607e.get(), this.f168608f.get());
    }
}
