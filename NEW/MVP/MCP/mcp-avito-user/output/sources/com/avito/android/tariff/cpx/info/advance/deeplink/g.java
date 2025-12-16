package com.avito.android.tariff.cpx.info.advance.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoAdvanceShowDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f296308a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f296309b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f296310c;

    public g(dagger.internal.f fVar, dv.b bVar, dv.b bVar2) {
        this.f296308a = bVar;
        this.f296309b = bVar2;
        this.f296310c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.deeplink_handler.handler.composite.a) this.f296310c.get(), (a.d) this.f296308a.get(), (a.f) this.f296309b.get());
    }
}
