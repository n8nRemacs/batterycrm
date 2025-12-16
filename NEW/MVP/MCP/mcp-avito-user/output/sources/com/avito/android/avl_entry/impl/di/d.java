package com.avito.android.avl_entry.impl.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ShortVideosCarouselItemModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f98470a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f98471b;

    public d(u uVar, Provider provider) {
        this.f98470a = uVar;
        this.f98471b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f98470a.get();
        com.avito.konveyor.a aVar = this.f98471b.get();
        c.f98469a.getClass();
        return new com.avito.konveyor.adapter.j(hVar, aVar);
    }
}
