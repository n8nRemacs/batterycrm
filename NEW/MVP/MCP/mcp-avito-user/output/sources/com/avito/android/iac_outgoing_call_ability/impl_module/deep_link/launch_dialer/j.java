package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vN.C49239c;
import zL.InterfaceC50481a;

/* compiled from: IacStartRecallFromSystemApiLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<NK.a> f168619a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f168620b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC50481a> f168621c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<PK.a> f168622d;

    /* renamed from: e, reason: collision with root package name */
    public final C49239c f168623e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f168624f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<MK.a> f168625g;

    public j(Provider provider, C25721c c25721c, Provider provider2, Provider provider3, C49239c c49239c, dv.b bVar, Provider provider4) {
        this.f168619a = provider;
        this.f168620b = c25721c;
        this.f168621c = provider2;
        this.f168622d = provider3;
        this.f168623e = c49239c;
        this.f168624f = bVar;
        this.f168625g = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        NK.a aVar = this.f168619a.get();
        C25719a c25719a = (C25719a) this.f168620b.get();
        InterfaceC50481a interfaceC50481a = this.f168621c.get();
        PK.a aVar2 = this.f168622d.get();
        this.f168623e.get();
        return new h(aVar, c25719a, interfaceC50481a, aVar2, (a.i) this.f168624f.get(), this.f168625g.get());
    }
}
