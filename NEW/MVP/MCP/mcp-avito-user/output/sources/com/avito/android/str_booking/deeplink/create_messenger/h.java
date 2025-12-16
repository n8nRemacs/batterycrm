package com.avito.android.str_booking.deeplink.create_messenger;

import Px0.InterfaceC14851a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCreateMessengerDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14851a> f285430a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f285431b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f285432c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f285433d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f285434e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f285435f;

    public h(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f285430a = provider;
        this.f285431b = bVar;
        this.f285432c = bVar2;
        this.f285433d = provider2;
        this.f285434e = fVar;
        this.f285435f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f285430a.get(), (a.g) this.f285431b.get(), (a.i) this.f285432c.get(), this.f285433d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f285434e.get(), this.f285435f.get());
    }
}
