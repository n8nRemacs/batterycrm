package com.avito.android.category_items_tree.screens.tree_screen;

import Tn.InterfaceC15379a;
import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TreeInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15379a> f117143a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f117144b;

    public i(Provider<InterfaceC15379a> provider, Provider<R0> provider2) {
        this.f117143a = provider;
        this.f117144b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f117144b.get(), dagger.internal.g.a(w.a(this.f117143a)));
    }
}
