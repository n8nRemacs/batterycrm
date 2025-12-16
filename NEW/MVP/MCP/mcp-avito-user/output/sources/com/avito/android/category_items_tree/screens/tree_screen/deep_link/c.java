package com.avito.android.category_items_tree.screens.tree_screen.deep_link;

import com.avito.android.category_items_tree.TreeDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TreeDeepLinkHandlerModule_ProvideTreeDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f117106a;

    /* renamed from: b, reason: collision with root package name */
    public final d f117107b;

    public c(f fVar, d dVar) {
        this.f117106a = fVar;
        this.f117107b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f117106a.getClass();
        e eVar = new e();
        b.f117105a.getClass();
        return new C43834a(TreeDeepLink.class, eVar, new C43834a.b.C11809b(this.f117107b));
    }
}
