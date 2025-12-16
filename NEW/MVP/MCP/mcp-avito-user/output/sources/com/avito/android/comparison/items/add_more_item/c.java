package com.avito.android.comparison.items.add_more_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AddMoreItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f123920a;

    public c(f fVar) {
        this.f123920a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f123920a.get());
    }
}
