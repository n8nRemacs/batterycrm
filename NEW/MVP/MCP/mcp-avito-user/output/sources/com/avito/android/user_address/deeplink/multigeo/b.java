package com.avito.android.user_address.deeplink.multigeo;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_address.deeplink.k;
import com.avito.android.user_address.deeplink.m;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiGeoMapDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f307250a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307251b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f307252c;

    public b(dv.b bVar, m mVar, dv.b bVar2) {
        this.f307250a = bVar;
        this.f307251b = mVar;
        this.f307252c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f307250a.get(), (k) this.f307251b.get(), (a.InterfaceC4053a) this.f307252c.get());
    }
}
