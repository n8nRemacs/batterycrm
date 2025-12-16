package com.avito.android.profile_settings_extended;

import android.content.res.Resources;

/* compiled from: ExtendedProfileSettingsResourceProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f229075a;

    public S(dagger.internal.l lVar) {
        this.f229075a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new Q((Resources) this.f229075a.f393949a);
    }
}
