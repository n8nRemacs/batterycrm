package com.avito.android.safedeal.universal_delivery_type;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f256634a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f256635b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f256636c;

    public j(C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f256634a = c30102l3;
        this.f256635b = bVar;
        this.f256636c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Context) this.f256634a.get(), (a.InterfaceC4053a) this.f256635b.get(), (a.b) this.f256636c.get());
    }
}
