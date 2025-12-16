package com.avito.android.category_items_tree.screens.items_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryItemsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f116986a;

    /* renamed from: b, reason: collision with root package name */
    public final u f116987b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f116988c;

    public e(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f116986a = lVar;
        this.f116987b = uVar;
        this.f116988c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((CategoryItemsArguments) this.f116986a.f393949a, (com.avito.android.category_items_tree.screens.items_screen.h) this.f116987b.get(), this.f116988c.get());
    }
}
