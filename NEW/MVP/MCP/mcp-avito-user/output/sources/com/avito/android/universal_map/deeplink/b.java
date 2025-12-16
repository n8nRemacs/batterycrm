package com.avito.android.universal_map.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CreateRouteLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f304765a;

    public b(dv.b bVar) {
        this.f304765a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f304765a.get());
    }
}
