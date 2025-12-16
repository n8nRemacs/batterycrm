package com.avito.android.section.chips;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionChipsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264628a;

    public b(u uVar) {
        this.f264628a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f264628a.get());
    }
}
