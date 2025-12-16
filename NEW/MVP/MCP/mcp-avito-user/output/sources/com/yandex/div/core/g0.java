package com.yandex.div.core;

import javax.inject.Provider;

/* compiled from: DivKitConfiguration_SendBeaconConfigurationFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class g0 implements dagger.internal.h<com.yandex.android.beacon.b> {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f367541a;

    public g0(a0 a0Var) {
        this.f367541a = a0Var;
    }

    @Override // javax.inject.Provider
    @Y61.l
    public final Object get() {
        Provider<com.yandex.android.beacon.b> provider = this.f367541a.f367271a;
        if (provider == null) {
            return null;
        }
        return provider.get();
    }
}
