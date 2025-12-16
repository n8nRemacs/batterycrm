package com.avito.android.item_map.view;

import android.content.res.Resources;

/* compiled from: ItemMapResourcesProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class N implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f173483a;

    public N(dagger.internal.l lVar) {
        this.f173483a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new M((Resources) this.f173483a.f393949a);
    }
}
