package com.avito.android.developments_agency_search.adapter.checkable_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckableItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f136221a;

    public c(g gVar) {
        this.f136221a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f136221a.get());
    }
}
