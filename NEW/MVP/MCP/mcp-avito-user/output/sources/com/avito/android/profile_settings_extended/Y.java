package com.avito.android.profile_settings_extended;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: ProfileSettingsStateProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f229085a;

    public Y(Provider<InterfaceC35863o4> provider) {
        this.f229085a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new X(this.f229085a.get());
    }
}
