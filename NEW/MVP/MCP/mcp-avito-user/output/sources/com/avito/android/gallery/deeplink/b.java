package com.avito.android.gallery.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import gF.InterfaceC40577a;

/* compiled from: OpenGalleryDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f159217a;

    /* renamed from: b, reason: collision with root package name */
    public final gF.c f159218b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f159219c;

    public b(dv.b bVar, gF.c cVar, dv.b bVar2) {
        this.f159217a = bVar;
        this.f159218b = cVar;
        this.f159219c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f159217a.get(), (InterfaceC40577a) this.f159218b.get(), (a.b) this.f159219c.get());
    }
}
