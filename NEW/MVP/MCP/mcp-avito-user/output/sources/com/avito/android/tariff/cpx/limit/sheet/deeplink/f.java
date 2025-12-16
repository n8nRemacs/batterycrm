package com.avito.android.tariff.cpx.limit.sheet.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLimitShowHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f297272a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f297273b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f297274c;

    public f(dagger.internal.f fVar, dv.b bVar, dv.b bVar2) {
        this.f297272a = bVar;
        this.f297273b = bVar2;
        this.f297274c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.deeplink_handler.handler.composite.a) this.f297274c.get(), (a.d) this.f297272a.get(), (a.f) this.f297273b.get());
    }
}
