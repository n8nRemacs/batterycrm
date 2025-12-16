package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import iD0.InterfaceC41271a;

/* compiled from: TariffConstructorLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f299592a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f299593b;

    /* renamed from: c, reason: collision with root package name */
    public final k f299594c;

    public p(dv.b bVar, dv.b bVar2, k kVar) {
        this.f299592a = bVar;
        this.f299593b = bVar2;
        this.f299594c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((a.InterfaceC4053a) this.f299592a.get(), (a.b) this.f299593b.get(), (InterfaceC41271a) this.f299594c.get());
    }
}
