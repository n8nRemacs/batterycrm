package com.avito.android.favorite_apprater;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteAppRaterInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final o f155266a;

    public e(o oVar) {
        this.f155266a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((j) this.f155266a.get());
    }
}
