package com.avito.android.user_address.deeplink.multigeo;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_address.deeplink.k;
import com.avito.android.user_address.deeplink.m;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiGeoSuggestDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f307260a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307261b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f307262c;

    public g(dv.b bVar, m mVar, dv.b bVar2) {
        this.f307260a = bVar;
        this.f307261b = mVar;
        this.f307262c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((a.b) this.f307260a.get(), (k) this.f307261b.get(), (a.InterfaceC4053a) this.f307262c.get());
    }
}
