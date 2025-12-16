package com.avito.android.serp.adapter.recomendations;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExpandableSectionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f270552a;

    public b(u uVar) {
        this.f270552a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f270552a.get());
    }
}
