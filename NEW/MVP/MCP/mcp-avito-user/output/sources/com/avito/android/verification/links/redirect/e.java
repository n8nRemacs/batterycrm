package com.avito.android.verification.links.redirect;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: VerificationRedirectLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f324352a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324353b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324354c;

    /* renamed from: d, reason: collision with root package name */
    public final h f324355d;

    /* renamed from: e, reason: collision with root package name */
    public final u f324356e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.f f324357f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<R0> f324358g;

    public e(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, h hVar, u uVar, dagger.internal.f fVar2, Provider provider) {
        this.f324352a = fVar;
        this.f324353b = bVar;
        this.f324354c = bVar2;
        this.f324355d = hVar;
        this.f324356e = uVar;
        this.f324357f = fVar2;
        this.f324358g = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.deeplink_handler.handler.composite.a) this.f324352a.get(), (a.g) this.f324353b.get(), (a.i) this.f324354c.get(), (g) this.f324355d.get(), (InterfaceC50647a) this.f324356e.get(), (InterfaceC28373a) this.f324357f.get(), this.f324358g.get());
    }
}
