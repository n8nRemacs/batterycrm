package com.avito.android.profile_settings.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileSettingsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f228465a;

    public e(u uVar) {
        this.f228465a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.profile_settings.f) this.f228465a.get());
    }
}
