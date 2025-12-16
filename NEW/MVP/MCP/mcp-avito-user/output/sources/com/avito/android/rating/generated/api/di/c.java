package com.avito.android.rating.generated.api.di;

import com.avito.android.rating.generated.api.api_11_profile_ratings_get.a;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.b;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.c;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.d;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.e;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.a;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.b;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.c;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.d;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.e;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.f;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: RatingJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class c implements h<Set<r>> {

    /* compiled from: RatingJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f247614a = new c();
    }

    public static c a() {
        return a.f247614a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating.generated.api.di.a.f247612a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, com.avito.android.rating.generated.api.api_11_profile_ratings_get.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.C7425a.class, "api");
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, "web");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(com.avito.android.rating.generated.api.api_11_profile_ratings_get.b.class, b.a.class, "answer", b.C7426b.class, "bottomSheet");
        optimalRuntimeTypeAdapterFactoryK.b(b.c.class, RequestReviewResultKt.INFO_TYPE);
        optimalRuntimeTypeAdapterFactoryK.b(b.d.class, "link");
        optimalRuntimeTypeAdapterFactoryK.b(b.e.class, "networkRequest");
        optimalRuntimeTypeAdapterFactoryK.b(b.f.class, "removeAnswer");
        optimalRuntimeTypeAdapterFactoryK.b(b.g.class, "removeBuyerReview");
        optimalRuntimeTypeAdapterFactoryK.b(b.h.class, "removeModelReview");
        optimalRuntimeTypeAdapterFactoryK.b(b.i.class, "removeReview");
        optimalRuntimeTypeAdapterFactoryK.b(b.j.class, "textSheet");
        optimalRuntimeTypeAdapterFactoryK.b(b.k.class, "textSheetWeb");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = D8.k(com.avito.android.rating.generated.api.api_11_profile_ratings_get.c.class, c.a.class, "api", c.b.class, "web");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK3 = D8.k(d.class, d.a.class, "badgeScore", d.b.class, "button");
        optimalRuntimeTypeAdapterFactoryK3.b(d.c.class, "header");
        optimalRuntimeTypeAdapterFactoryK3.b(d.C7427d.class, RequestReviewResultKt.INFO_TYPE);
        optimalRuntimeTypeAdapterFactoryK3.b(d.e.class, "llmSummary");
        optimalRuntimeTypeAdapterFactoryK3.b(d.f.class, "paramScoreSummary");
        optimalRuntimeTypeAdapterFactoryK3.b(d.g.class, "photoGallery");
        optimalRuntimeTypeAdapterFactoryK3.b(d.i.class, "rating");
        optimalRuntimeTypeAdapterFactoryK3.b(d.h.class, "ratingStatistic");
        optimalRuntimeTypeAdapterFactoryK3.b(d.j.class, "score");
        optimalRuntimeTypeAdapterFactoryK3.b(d.k.class, "searchParameters");
        optimalRuntimeTypeAdapterFactoryK3.b(d.l.class, "searchParametersV2");
        optimalRuntimeTypeAdapterFactoryK3.b(d.m.class, "text");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK4 = D8.k(com.avito.android.rating.generated.api.api_11_profile_ratings_get.e.class, e.a.class, "inlineBoolFilter", e.b.class, SearchParamsConverterKt.SORT);
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(com.avito.android.rating.generated.api.api_9_profile_reviews_get.a.class);
        optimalRuntimeTypeAdapterFactory.b(a.C7428a.class, "api");
        optimalRuntimeTypeAdapterFactory.b(a.b.class, "web");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK5 = D8.k(com.avito.android.rating.generated.api.api_9_profile_reviews_get.b.class, b.a.class, "buyer", b.C7429b.class, "model");
        optimalRuntimeTypeAdapterFactoryK5.b(b.c.class, "seller");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory2 = new OptimalRuntimeTypeAdapterFactory(com.avito.android.rating.generated.api.api_9_profile_reviews_get.c.class);
        optimalRuntimeTypeAdapterFactory2.b(c.a.class, "api");
        optimalRuntimeTypeAdapterFactory2.b(c.b.class, "web");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK6 = D8.k(com.avito.android.rating.generated.api.api_9_profile_reviews_get.d.class, d.a.class, "api", d.b.class, "web");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK7 = D8.k(com.avito.android.rating.generated.api.api_9_profile_reviews_get.e.class, e.a.class, "api", e.b.class, "web");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK8 = D8.k(f.class, f.a.class, "answer", f.b.class, "bottomSheet");
        optimalRuntimeTypeAdapterFactoryK8.b(f.c.class, RequestReviewResultKt.INFO_TYPE);
        optimalRuntimeTypeAdapterFactoryK8.b(f.d.class, "link");
        optimalRuntimeTypeAdapterFactoryK8.b(f.e.class, "networkRequest");
        optimalRuntimeTypeAdapterFactoryK8.b(f.C7430f.class, "removeAnswer");
        optimalRuntimeTypeAdapterFactoryK8.b(f.g.class, "removeBuyerReview");
        optimalRuntimeTypeAdapterFactoryK8.b(f.h.class, "removeModelReview");
        optimalRuntimeTypeAdapterFactoryK8.b(f.i.class, "removeReview");
        optimalRuntimeTypeAdapterFactoryK8.b(f.j.class, "textSheet");
        optimalRuntimeTypeAdapterFactoryK8.b(f.k.class, "textSheetWeb");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2, optimalRuntimeTypeAdapterFactoryK3, optimalRuntimeTypeAdapterFactoryK4, optimalRuntimeTypeAdapterFactory, optimalRuntimeTypeAdapterFactoryK5, optimalRuntimeTypeAdapterFactory2, optimalRuntimeTypeAdapterFactoryK6, optimalRuntimeTypeAdapterFactoryK7, optimalRuntimeTypeAdapterFactoryK8});
        t.d(setL0);
        return setL0;
    }
}
