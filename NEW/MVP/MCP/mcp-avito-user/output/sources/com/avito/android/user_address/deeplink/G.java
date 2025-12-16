package com.avito.android.user_address.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: UserAddressSuggestDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f307210a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307211b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f307212c;

    public G(dv.b bVar, m mVar, dv.b bVar2) {
        this.f307210a = bVar;
        this.f307211b = mVar;
        this.f307212c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F((a.b) this.f307210a.get(), (k) this.f307211b.get(), (a.InterfaceC4053a) this.f307212c.get());
    }
}
