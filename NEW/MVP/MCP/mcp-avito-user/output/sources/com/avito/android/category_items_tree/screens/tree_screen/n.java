package com.avito.android.category_items_tree.screens.tree_screen;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TreeViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.category_items_tree.screens.tree_screen.mvi.i f117179a;

    public n(com.avito.android.category_items_tree.screens.tree_screen.mvi.i iVar) {
        this.f117179a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.category_items_tree.screens.tree_screen.mvi.h) this.f117179a.get(), null, 2, null);
    }
}
