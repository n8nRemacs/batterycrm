package com.avito.android.category_items_tree.screens.items_screen.deep_link;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryItemsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f116929a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f116930b;

    public d(h hVar, dv.b bVar) {
        this.f116929a = hVar;
        this.f116930b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((g) this.f116929a.get(), (a.InterfaceC4053a) this.f116930b.get());
    }
}
