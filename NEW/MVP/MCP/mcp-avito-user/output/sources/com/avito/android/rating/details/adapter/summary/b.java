package com.avito.android.rating.details.adapter.summary;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SummaryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f246557a;

    public b(u uVar) {
        this.f246557a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f246557a.get());
    }
}
