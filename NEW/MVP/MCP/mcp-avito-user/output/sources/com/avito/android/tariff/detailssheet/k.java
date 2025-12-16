package com.avito.android.tariff.detailssheet;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffDetailsSheetLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f297431a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f297432b;

    /* renamed from: c, reason: collision with root package name */
    public final h f297433c;

    public k(dv.b bVar, dv.b bVar2, h hVar) {
        this.f297431a = bVar;
        this.f297432b = bVar2;
        this.f297433c = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((a.InterfaceC4053a) this.f297431a.get(), (a.b) this.f297432b.get(), (f) this.f297433c.get());
    }
}
