package com.avito.android.publish.start_publish.di;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StartPublishSheetModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final j f245394a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245395b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f245396c;

    public k(j jVar, u uVar, Provider provider) {
        this.f245394a = jVar;
        this.f245395b = uVar;
        this.f245396c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f245395b.get();
        com.avito.konveyor.a aVar2 = this.f245396c.get();
        this.f245394a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
