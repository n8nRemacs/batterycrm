package com.avito.android.profile_settings_extended.adapter.setting;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f229849a;

    public b(u uVar) {
        this.f229849a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f229849a.get());
    }
}
