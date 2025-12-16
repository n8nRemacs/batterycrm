package com.avito.android.safedeal.universal_delivery_type.courier.select_location;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.delivery_location_suggest.i;
import com.avito.android.delivery_location_suggest.j;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryCourierLocationSelectDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f256565a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f256566b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f256567c;

    /* renamed from: d, reason: collision with root package name */
    public final j f256568d;

    public e(dv.b bVar, dv.b bVar2, C30102l3 c30102l3, j jVar) {
        this.f256565a = bVar;
        this.f256566b = bVar2;
        this.f256567c = c30102l3;
        this.f256568d = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f256565a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f256566b.get();
        Context context = (Context) this.f256567c.get();
        this.f256568d.getClass();
        return new a(bVar, interfaceC4053a, context, new i());
    }
}
