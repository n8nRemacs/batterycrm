package com.avito.android.section.placeholder;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionPlaceholderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264859a;

    public b(u uVar) {
        this.f264859a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f264859a.get());
    }
}
