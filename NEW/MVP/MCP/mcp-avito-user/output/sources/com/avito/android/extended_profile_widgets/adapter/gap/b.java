package com.avito.android.extended_profile_widgets.adapter.gap;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GapItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f154414a;

    public b(u uVar) {
        this.f154414a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154414a.get());
    }
}
