package com.avito.android.recommendation_items_loader_impl.screen;

import com.avito.android.recommendation_items_loader_impl.screen.mvi.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecommendationLoaderViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f252306a;

    public c(i iVar) {
        this.f252306a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.recommendation_items_loader_impl.screen.mvi.h) this.f252306a.get(), null, 2, null);
    }
}
