package com.avito.android.category_items_tree.screens.items_screen;

import Tn.InterfaceC15379a;
import com.avito.android.util.R0;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryItemsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f116965a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15379a> f116966b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f116967c;

    /* renamed from: d, reason: collision with root package name */
    public final o f116968d;

    public j(dagger.internal.l lVar, Provider provider, Provider provider2, o oVar) {
        this.f116965a = lVar;
        this.f116966b = provider;
        this.f116967c = provider2;
        this.f116968d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((CategoryItemsArguments) this.f116965a.f393949a, dagger.internal.g.a(w.a(this.f116966b)), this.f116967c.get(), (n) this.f116968d.get());
    }
}
