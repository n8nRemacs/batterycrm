package com.avito.android.advertising.advertising_creative.di;

import com.avito.android.remote.model.advertising.AvitoNetworkBannerRaw;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: JsonModule_ProvideTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes11.dex */
public final class c implements h<Set<r>> {

    /* compiled from: JsonModule_ProvideTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f87760a = new c();
    }

    public static c a() {
        return a.f87760a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = b.f87759a;
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, AvitoNetworkBannerRaw.class);
        optimalRuntimeTypeAdapterFactoryA.b(AvitoNetworkBannerRaw.Image.class, "image");
        optimalRuntimeTypeAdapterFactoryA.b(AvitoNetworkBannerRaw.ProfilePromo.class, "profilePromo");
        optimalRuntimeTypeAdapterFactoryA.b(AvitoNetworkBannerRaw.ProfilePromoGallery.class, "profilePromoGallery");
        optimalRuntimeTypeAdapterFactoryA.b(AvitoNetworkBannerRaw.Outclick.class, "outclickCreative");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
