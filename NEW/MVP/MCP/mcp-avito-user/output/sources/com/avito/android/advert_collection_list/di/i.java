package com.avito.android.advert_collection_list.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertCollectionListModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f82092a;

    public i(u uVar) {
        this.f82092a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f82092a.get();
        c.f82083a.getClass();
        return jVar;
    }
}
