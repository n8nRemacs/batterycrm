package com.avito.android.autoteka.items.fullScreenError.report;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReportErrorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f96806a;

    public b(f fVar) {
        this.f96806a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f96806a.get());
    }
}
