package com.avito.android.support_bottom_sheet.gig_deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.t1;
import com.avito.android.util.C35833k6;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigSupportDialogDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f292453a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ZG.a> f292454b;

    /* renamed from: c, reason: collision with root package name */
    public final C35833k6 f292455c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f292456d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f292457e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f292458f;

    /* renamed from: g, reason: collision with root package name */
    public final dv.b f292459g;

    public e(dv.b bVar, Provider provider, C35833k6 c35833k6, dagger.internal.f fVar, dv.b bVar2, Provider provider2, dv.b bVar3) {
        this.f292453a = bVar;
        this.f292454b = provider;
        this.f292455c = c35833k6;
        this.f292456d = fVar;
        this.f292457e = bVar2;
        this.f292458f = provider2;
        this.f292459g = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f292453a.get(), this.f292454b.get(), (t1) this.f292455c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f292456d.get(), (a.g) this.f292457e.get(), this.f292458f.get(), (a.i) this.f292459g.get());
    }
}
