package com.avito.android.extended_profile_map.di;

import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.yandex.YandexAvitoMapAttachHelper;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileMapModule_ProvideAvitoMapAttachHelperFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<AvitoMapAttachHelper> {

    /* compiled from: ExtendedProfileMapModule_ProvideAvitoMapAttachHelperFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f151245a = new g();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f151244a.getClass();
        return new YandexAvitoMapAttachHelper(true);
    }
}
