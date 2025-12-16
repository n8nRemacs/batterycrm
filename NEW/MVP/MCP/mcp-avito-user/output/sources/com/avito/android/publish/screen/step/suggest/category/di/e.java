package com.avito.android.publish.screen.step.suggest.category.di;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestCategoryModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242329a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f242330b;

    public e(u uVar, Provider provider) {
        this.f242329a = uVar;
        this.f242330b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f242329a.get();
        com.avito.konveyor.a aVar2 = this.f242330b.get();
        d.f242328a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
