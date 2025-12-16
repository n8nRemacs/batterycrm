package com.avito.android.safety.tfa_disable_password.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TfaDisablePasswordActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.safety.safety_settings.domain.d> f258113a;

    public c(Provider<com.avito.android.safety.safety_settings.domain.d> provider) {
        this.f258113a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f258113a.get());
    }
}
