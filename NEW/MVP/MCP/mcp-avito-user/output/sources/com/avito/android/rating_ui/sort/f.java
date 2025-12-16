package com.avito.android.rating_ui.sort;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingSortItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f250450a;

    /* renamed from: b, reason: collision with root package name */
    public final l f250451b;

    /* renamed from: c, reason: collision with root package name */
    public final l f250452c;

    public f(l lVar, l lVar2, l lVar3) {
        this.f250450a = lVar;
        this.f250451b = lVar2;
        this.f250452c = lVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.a) this.f250452c.f393949a, (Y41.l) this.f250450a.f393949a, (Y41.l) this.f250451b.f393949a);
    }
}
