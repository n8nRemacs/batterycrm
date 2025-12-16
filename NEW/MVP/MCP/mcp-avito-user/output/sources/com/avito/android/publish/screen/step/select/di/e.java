package com.avito.android.publish.screen.step.select.di;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final d f242147a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242148b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f242149c;

    public e(d dVar, u uVar, Provider provider) {
        this.f242147a = dVar;
        this.f242148b = uVar;
        this.f242149c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f242148b.get();
        com.avito.konveyor.a aVar2 = this.f242149c.get();
        this.f242147a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
