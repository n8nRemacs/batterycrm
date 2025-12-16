package com.avito.android.user_address.deeplink.sx_new_address;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_address.deeplink.k;
import com.avito.android.user_address.deeplink.m;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressAddLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f307282a;

    /* renamed from: b, reason: collision with root package name */
    public final m f307283b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.sx_address.deeplink.y f307284c;

    public c(dv.b bVar, m mVar, com.avito.android.sx_address.deeplink.y yVar) {
        this.f307282a = bVar;
        this.f307283b = mVar;
        this.f307284c = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f307282a.get();
        k kVar = (k) this.f307283b.get();
        this.f307284c.getClass();
        return new a(interfaceC4053a, kVar, new com.avito.android.sx_address.deeplink.x());
    }
}
