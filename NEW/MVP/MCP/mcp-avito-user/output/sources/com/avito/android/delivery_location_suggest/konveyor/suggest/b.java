package com.avito.android.delivery_location_suggest.konveyor.suggest;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuggestBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f135127a;

    public b(f fVar) {
        this.f135127a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f135127a.get());
    }
}
