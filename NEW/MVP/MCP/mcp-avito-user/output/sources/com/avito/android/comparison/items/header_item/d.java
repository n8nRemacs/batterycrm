package com.avito.android.comparison.items.header_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonHeaderItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f123962a;

    public d(j jVar) {
        this.f123962a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((i) this.f123962a.get());
    }
}
