package com.avito.android.profile_settings_basic.adapter.badge_bar;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BadgeBarItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f228577a;

    public b(u uVar) {
        this.f228577a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f228577a.get());
    }
}
