package com.avito.android.success.konveyor.title;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessTitleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f291660a;

    public b(e eVar) {
        this.f291660a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f291660a.get());
    }
}
