package com.avito.android.extended_profile_adverts.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: ProfileAdvertsModule_ProvideFromPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<FromPageSource> {

    /* renamed from: a, reason: collision with root package name */
    public final n f150830a;

    public t(n nVar) {
        this.f150830a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f150830a.getClass();
        FromPageSource.ExtendedProfile extendedProfile = FromPageSource.ExtendedProfile.f82327c;
        dagger.internal.t.d(extendedProfile);
        return extendedProfile;
    }
}
