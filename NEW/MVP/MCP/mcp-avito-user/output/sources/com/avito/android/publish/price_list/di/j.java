package com.avito.android.publish.price_list.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListItemsModule_ProvideListUpdateCallback$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f238506a;

    public j(dagger.internal.f fVar) {
        this.f238506a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f238506a.get();
        e.f238492a.getClass();
        return jVar;
    }
}
