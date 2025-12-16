package com.avito.android.saved_searches.deeplinks;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f258269a;

    public d(dv.b bVar) {
        this.f258269a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f258269a.get());
    }
}
