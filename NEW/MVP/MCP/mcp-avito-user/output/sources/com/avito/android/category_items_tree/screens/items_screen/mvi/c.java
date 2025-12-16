package com.avito.android.category_items_tree.screens.items_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryItemsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f116979a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f116980b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f116981c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f116982d;

    public c(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2) {
        this.f116979a = uVar;
        this.f116980b = provider;
        this.f116981c = lVar;
        this.f116982d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.category_items_tree.screens.items_screen.h) this.f116979a.get(), this.f116980b.get(), (CategoryItemsArguments) this.f116981c.f393949a, this.f116982d.get());
    }
}
