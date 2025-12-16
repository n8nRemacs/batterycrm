package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import iD0.InterfaceC41271a;

/* compiled from: TariffConstructorBottomSheetLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f299583a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f299584b;

    /* renamed from: c, reason: collision with root package name */
    public final k f299585c;

    public n(dv.b bVar, dv.b bVar2, k kVar) {
        this.f299583a = bVar;
        this.f299584b = bVar2;
        this.f299585c = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((a.InterfaceC4053a) this.f299583a.get(), (a.b) this.f299584b.get(), (InterfaceC41271a) this.f299585c.get());
    }
}
