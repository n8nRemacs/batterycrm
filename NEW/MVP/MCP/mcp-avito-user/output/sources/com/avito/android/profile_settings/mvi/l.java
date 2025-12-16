package com.avito.android.profile_settings.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileSettingsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f228492a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f228493b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f228494c;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f228492a = provider;
        this.f228493b = lVar;
        this.f228494c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f228492a.get(), (ProfileSettingsMviFragment.Args) this.f228493b.f393949a, this.f228494c.get());
    }
}
