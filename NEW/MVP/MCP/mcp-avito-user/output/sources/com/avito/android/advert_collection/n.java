package com.avito.android.advert_collection;

import android.content.res.Resources;

/* compiled from: AdvertCollectionResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f81687a;

    public n(dagger.internal.l lVar) {
        this.f81687a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((Resources) this.f81687a.f393949a);
    }
}
