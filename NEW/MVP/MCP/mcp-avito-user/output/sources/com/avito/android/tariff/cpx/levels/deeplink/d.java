package com.avito.android.tariff.cpx.levels.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxLevelsDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f297048a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f297049b;

    /* renamed from: c, reason: collision with root package name */
    public final f f297050c;

    public d(f fVar, dv.b bVar, dv.b bVar2) {
        this.f297048a = bVar;
        this.f297049b = bVar2;
        this.f297050c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deeplink_handler.handler.composite.a) this.f297050c.get(), (a.d) this.f297048a.get(), (a.f) this.f297049b.get());
    }
}
