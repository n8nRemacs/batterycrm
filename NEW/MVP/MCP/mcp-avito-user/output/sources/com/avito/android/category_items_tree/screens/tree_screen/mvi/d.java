package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.screens.tree_screen.TreeArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TreeActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f117155a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f117156b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f117157c;

    public d(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f117155a = provider;
        this.f117156b = lVar;
        this.f117157c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f117155a.get(), (TreeArguments) this.f117156b.f393949a, this.f117157c.get());
    }
}
