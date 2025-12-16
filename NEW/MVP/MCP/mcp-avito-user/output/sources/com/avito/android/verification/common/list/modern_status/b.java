package com.avito.android.verification.common.list.modern_status;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ModernStatusItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f323430a;

    public b(f fVar) {
        this.f323430a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f323430a.get());
    }
}
