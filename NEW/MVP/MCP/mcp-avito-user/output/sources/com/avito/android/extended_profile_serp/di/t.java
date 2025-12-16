package com.avito.android.extended_profile_serp.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: ExtendedProfileSerpModule_ProvideFromPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<FromPageSource> {

    /* compiled from: ExtendedProfileSerpModule_ProvideFromPageSourceFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final t f152867a = new t();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30538h.f152853a.getClass();
        FromPageSource.ExtendedProfile extendedProfile = FromPageSource.ExtendedProfile.f82327c;
        dagger.internal.t.d(extendedProfile);
        return extendedProfile;
    }
}
