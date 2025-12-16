package com.avito.android.advert.item.beduin.v2.di;

import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemCardNativeCellWrapperModule_ItemCardNativeCellWrapperComponentFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<n<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f73302a;

    public h(u uVar) {
        this.f73302a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.item.beduin.v2.i iVar = (com.avito.android.advert.item.beduin.v2.i) this.f73302a.get();
        g.f73301a.getClass();
        return iVar;
    }
}
