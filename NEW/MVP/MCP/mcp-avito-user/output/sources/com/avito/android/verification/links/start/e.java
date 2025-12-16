package com.avito.android.verification.links.start;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zz.InterfaceC50647a;

/* compiled from: VerificationStartLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f324516a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f324517b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f324518c;

    /* renamed from: d, reason: collision with root package name */
    public final h f324519d;

    /* renamed from: e, reason: collision with root package name */
    public final u f324520e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f324521f;

    public e(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, h hVar, u uVar, Provider provider) {
        this.f324516a = fVar;
        this.f324517b = bVar;
        this.f324518c = bVar2;
        this.f324519d = hVar;
        this.f324520e = uVar;
        this.f324521f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.deeplink_handler.handler.composite.a) this.f324516a.get(), (a.g) this.f324517b.get(), (a.i) this.f324518c.get(), (g) this.f324519d.get(), (InterfaceC50647a) this.f324520e.get(), this.f324521f.get());
    }
}
