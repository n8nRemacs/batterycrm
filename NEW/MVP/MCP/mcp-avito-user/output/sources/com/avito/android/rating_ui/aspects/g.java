package com.avito.android.rating_ui.aspects;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingAspectsItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f249875a;

    /* renamed from: b, reason: collision with root package name */
    public final l f249876b;

    public g(l lVar, l lVar2) {
        this.f249875a = lVar;
        this.f249876b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.a) this.f249876b.f393949a, (Y41.l) this.f249875a.f393949a);
    }
}
