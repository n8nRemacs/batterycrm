package com.avito.android.mortgage.applications_list.items.application;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f198416a;

    public c(g gVar) {
        this.f198416a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f198416a.get());
    }
}
