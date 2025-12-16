package com.avito.android.delivery_location_suggest.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.delivery_location_suggest.i;
import com.avito.android.delivery_location_suggest.j;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryAddressSelectDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f135063a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f135064b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f135065c;

    /* renamed from: d, reason: collision with root package name */
    public final j f135066d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f135067e;

    public b(dv.b bVar, dv.b bVar2, C30102l3 c30102l3, j jVar, Provider provider) {
        this.f135063a = bVar;
        this.f135064b = bVar2;
        this.f135065c = c30102l3;
        this.f135066d = jVar;
        this.f135067e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f135063a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f135064b.get();
        Context context = (Context) this.f135065c.get();
        this.f135066d.getClass();
        return new a(bVar, interfaceC4053a, context, new i(), this.f135067e.get());
    }
}
