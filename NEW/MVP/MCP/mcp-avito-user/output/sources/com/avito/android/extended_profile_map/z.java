package com.avito.android.extended_profile_map;

import javax.inject.Provider;

/* compiled from: ExtendedProfileMapViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_map.mvi.k f151340a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_ux_feedback.b> f151341b;

    public z(com.avito.android.extended_profile_map.mvi.k kVar, Provider provider) {
        this.f151340a = kVar;
        this.f151341b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new y((com.avito.android.extended_profile_map.mvi.j) this.f151340a.get(), this.f151341b.get());
    }
}
