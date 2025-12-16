package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsImageActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class N implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile_management_core.images.a> f230486a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.P> f230487b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f230488c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f230489d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f230490e;

    public N(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f230486a = provider;
        this.f230487b = provider2;
        this.f230488c = uVar;
        this.f230489d = provider3;
        this.f230490e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f230486a.get(), this.f230487b.get(), (com.avito.android.connection_quality.connectivity.a) this.f230488c.get(), this.f230489d.get(), this.f230490e.get());
    }
}
