package com.avito.android.profile_settings_basic.mvi;

/* compiled from: BasicProfileSettingsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f228901a;

    public n(dagger.internal.u uVar) {
        this.f228901a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.profile_settings_basic.s) this.f228901a.get());
    }
}
