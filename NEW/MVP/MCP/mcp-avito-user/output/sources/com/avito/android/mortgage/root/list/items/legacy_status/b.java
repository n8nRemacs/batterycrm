package com.avito.android.mortgage.root.list.items.legacy_status;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonalStatusBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f202658a;

    public b(g gVar) {
        this.f202658a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f202658a.get());
    }
}
