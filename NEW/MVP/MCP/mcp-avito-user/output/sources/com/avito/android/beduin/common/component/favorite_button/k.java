package com.avito.android.beduin.common.component.favorite_button;

import com.avito.android.favorite.m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinFavoriteButtonViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final m f101205a;

    /* renamed from: b, reason: collision with root package name */
    public final u f101206b;

    public k(m mVar, u uVar) {
        this.f101205a = mVar;
        this.f101206b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.favorite.h) this.f101205a.get(), (com.avito.android.advert_collection_toast.b) this.f101206b.get());
    }
}
