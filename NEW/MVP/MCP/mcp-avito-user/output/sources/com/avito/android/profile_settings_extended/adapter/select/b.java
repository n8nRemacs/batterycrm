package com.avito.android.profile_settings_extended.adapter.select;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f229831a;

    public b(e eVar) {
        this.f229831a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f229831a.get());
    }
}
