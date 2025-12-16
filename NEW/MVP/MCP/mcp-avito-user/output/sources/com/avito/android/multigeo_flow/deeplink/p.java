package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: JobMultiGeoEditDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f206855a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f206856b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f206857c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.multigeo_flow.domain.e f206858d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f206859e;

    public p(dv.b bVar, dv.b bVar2, dagger.internal.f fVar, com.avito.android.multigeo_flow.domain.e eVar, Provider provider) {
        this.f206855a = bVar;
        this.f206856b = bVar2;
        this.f206857c = fVar;
        this.f206858d = eVar;
        this.f206859e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((a.d) this.f206855a.get(), (a.g) this.f206856b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f206857c.get(), (com.avito.android.multigeo_flow.domain.b) this.f206858d.get(), this.f206859e.get());
    }
}
