package com.avito.android.user_address.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: UserAddressEditLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_address.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35345f implements dagger.internal.h<C35344e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f307234a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307235b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f307236c;

    public C35345f(dv.b bVar, m mVar, dv.b bVar2) {
        this.f307234a = bVar;
        this.f307235b = mVar;
        this.f307236c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35344e((a.b) this.f307234a.get(), (k) this.f307235b.get(), (a.InterfaceC4053a) this.f307236c.get());
    }
}
