package com.avito.android.barcode;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShowBarcodeLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f98674a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f98675b;

    /* renamed from: c, reason: collision with root package name */
    public final d f98676c;

    public g(dv.b bVar, dv.b bVar2, d dVar) {
        this.f98674a = bVar;
        this.f98675b = bVar2;
        this.f98676c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((a.b) this.f98674a.get(), (a.InterfaceC4053a) this.f98675b.get(), (a) this.f98676c.get());
    }
}
