package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.screens.tree_screen.TreeArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TreeBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f117166a;

    /* renamed from: b, reason: collision with root package name */
    public final u f117167b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f117168c;

    public f(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f117166a = lVar;
        this.f117167b = uVar;
        this.f117168c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((TreeArguments) this.f117166a.f393949a, (com.avito.android.category_items_tree.screens.tree_screen.f) this.f117167b.get(), this.f117168c.get());
    }
}
