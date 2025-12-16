package com.avito.android.free_delivery.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreeDeliveryLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.free_delivery.y f158663a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f158664b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f158665c;

    public e(com.avito.android.free_delivery.y yVar, dv.b bVar, dv.b bVar2) {
        this.f158663a = yVar;
        this.f158664b = bVar;
        this.f158665c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.free_delivery.x) this.f158663a.get(), (a.InterfaceC4053a) this.f158664b.get(), (a.b) this.f158665c.get());
    }
}
