package com.avito.android.profile_settings_basic;

import javax.inject.Provider;

/* compiled from: BasicProfileSettingsMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class z implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_settings_basic.mvi.q f228953a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f228954b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f228955c;

    public z(com.avito.android.profile_settings_basic.mvi.q qVar, dagger.internal.u uVar, Provider provider) {
        this.f228953a = qVar;
        this.f228954b = uVar;
        this.f228955c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.profile_settings_basic.mvi.p) this.f228953a.get(), (com.avito.android.profile_management_core.images.a) this.f228954b.get(), this.f228955c.get());
    }
}
