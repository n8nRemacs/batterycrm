package com.avito.android.universal_map.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalMapDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f304772a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.universal_map.g f304773b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f304774c;

    public f(dv.b bVar, com.avito.android.universal_map.g gVar, dv.b bVar2) {
        this.f304772a = bVar;
        this.f304773b = gVar;
        this.f304774c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.InterfaceC4053a) this.f304772a.get(), (com.avito.android.universal_map.e) this.f304773b.get(), (a.b) this.f304774c.get());
    }
}
