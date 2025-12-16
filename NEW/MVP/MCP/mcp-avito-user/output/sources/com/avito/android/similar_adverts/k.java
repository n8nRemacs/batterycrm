package com.avito.android.similar_adverts;

import android.content.res.Resources;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SimilarAdvertsResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f283936a;

    public k(dagger.internal.l lVar) {
        this.f283936a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Resources) this.f283936a.f393949a);
    }
}
