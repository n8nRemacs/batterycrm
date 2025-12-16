package com.avito.android.category_items_tree.screens.tree_screen.deep_link;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TreeDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f117108a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f117109b;

    public d(h hVar, dv.b bVar) {
        this.f117108a = hVar;
        this.f117109b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((g) this.f117108a.get(), (a.InterfaceC4053a) this.f117109b.get());
    }
}
