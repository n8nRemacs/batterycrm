package com.avito.android.category_items_tree.screens.items_screen.deep_link;

import com.avito.android.category_items_tree.CategoryItemsDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CategoryItemsDeepLinkHandlerModule_ProvideTreeDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f116927a;

    /* renamed from: b, reason: collision with root package name */
    public final d f116928b;

    public c(f fVar, d dVar) {
        this.f116927a = fVar;
        this.f116928b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f116927a.getClass();
        e eVar = new e();
        b.f116926a.getClass();
        return new C43834a(CategoryItemsDeepLink.class, eVar, new C43834a.b.C11809b(this.f116928b));
    }
}
