package com.avito.android.bxcontent.beduin_v2.favorite;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BxFavoriteButtonStateFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f109543a;

    public j(dagger.internal.f fVar) {
        this.f109543a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.deep_linking.x) this.f109543a.get());
    }
}
