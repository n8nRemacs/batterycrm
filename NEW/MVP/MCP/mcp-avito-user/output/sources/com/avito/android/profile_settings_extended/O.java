package com.avito.android.profile_settings_extended;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class O implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile_management_core.images.a> f229068a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.beduin.v2.engine.component.B> f229069b;

    /* renamed from: c, reason: collision with root package name */
    public final C31144q0 f229070c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.profile_settings_extended.mvi.A f229071d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f229072e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<gD.f> f229073f;

    public O(Provider provider, Provider provider2, C31144q0 c31144q0, com.avito.android.profile_settings_extended.mvi.A a12, dagger.internal.u uVar, Provider provider3) {
        this.f229068a = provider;
        this.f229069b = provider2;
        this.f229070c = c31144q0;
        this.f229071d = a12;
        this.f229072e = uVar;
        this.f229073f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_management_core.images.a aVar = this.f229068a.get();
        com.avito.beduin.v2.engine.component.B b12 = this.f229069b.get();
        aU0.b bVar = (aU0.b) this.f229070c.get();
        com.avito.android.profile_settings_extended.mvi.z zVar = (com.avito.android.profile_settings_extended.mvi.z) this.f229071d.get();
        h31.e eVarB = dagger.internal.g.b(this.f229072e);
        this.f229073f.get();
        return new J(aVar, b12, bVar, zVar, eVarB);
    }
}
