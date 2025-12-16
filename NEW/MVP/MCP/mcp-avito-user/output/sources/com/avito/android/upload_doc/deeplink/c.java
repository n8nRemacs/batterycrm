package com.avito.android.upload_doc.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigUploadDocDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.upload_doc.lifecycle.e f306725a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f306726b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f306727c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f306728d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f306729e;

    public c(com.avito.android.upload_doc.lifecycle.e eVar, dv.b bVar, C25721c c25721c, dv.b bVar2, Provider provider) {
        this.f306725a = eVar;
        this.f306726b = bVar;
        this.f306727c = c25721c;
        this.f306728d = bVar2;
        this.f306729e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((NG0.a) this.f306725a.get(), (a.InterfaceC4053a) this.f306726b.get(), (C25719a) this.f306727c.get(), (a.b) this.f306728d.get(), this.f306729e.get());
    }
}
