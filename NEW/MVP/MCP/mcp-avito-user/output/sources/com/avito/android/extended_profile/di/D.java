package com.avito.android.extended_profile.di;

import com.avito.android.advert_collection_toast.analytics.FromPageSource;

/* compiled from: ExtendedProfileModule_ProvideFromPageSourceFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<FromPageSource> {

    /* compiled from: ExtendedProfileModule_ProvideFromPageSourceFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final D f149521a = new D();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r.f149945a.getClass();
        FromPageSource.ExtendedProfile extendedProfile = FromPageSource.ExtendedProfile.f82327c;
        dagger.internal.t.d(extendedProfile);
        return extendedProfile;
    }
}
