package com.avito.android.rating_ui.gap;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingGapItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f250009a;

    public b(u uVar) {
        this.f250009a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f250009a.get());
    }
}
