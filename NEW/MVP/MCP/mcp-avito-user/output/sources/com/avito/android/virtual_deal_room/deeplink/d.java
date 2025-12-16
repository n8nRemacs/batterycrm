package com.avito.android.virtual_deal_room.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientEditDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f326448a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f326449b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f326450c;

    public d(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f326448a = bVar;
        this.f326449b = bVar2;
        this.f326450c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f326449b.get(), (a.f) this.f326448a.get(), this.f326450c.get());
    }
}
