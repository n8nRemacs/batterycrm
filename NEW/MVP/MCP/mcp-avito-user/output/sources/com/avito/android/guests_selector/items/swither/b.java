package com.avito.android.guests_selector.items.swither;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SwitcherItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f161511a;

    public b(e eVar) {
        this.f161511a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f161511a.get());
    }
}
