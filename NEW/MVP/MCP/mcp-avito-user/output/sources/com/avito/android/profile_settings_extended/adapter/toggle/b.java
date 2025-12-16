package com.avito.android.profile_settings_extended.adapter.toggle;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ToggleItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f229877a;

    public b(u uVar) {
        this.f229877a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f229877a.get());
    }
}
