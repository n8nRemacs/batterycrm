package com.avito.android.publish.details.di;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PublishDetailsListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class D implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f233613a;

    public D(dagger.internal.f fVar) {
        this.f233613a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f233613a.get();
        B.f233608a.getClass();
        jVar.setHasStableIds(true);
        return jVar;
    }
}
