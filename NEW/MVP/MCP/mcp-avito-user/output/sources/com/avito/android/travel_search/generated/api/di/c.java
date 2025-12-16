package com.avito.android.travel_search.generated.api.di;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.a;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;
import uF0.InterfaceC48892c;
import uF0.i;

/* compiled from: TravelSearchJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class c implements h<Set<r>> {

    /* compiled from: TravelSearchJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f303123a = new c();
    }

    public static c a() {
        return a.f303123a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_search.generated.api.di.a.f303121a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.a.class);
        optimalRuntimeTypeAdapterFactoryA.b(a.C9277a.class, DateRangeParameter.FormattedDateParameter.TYPE);
        optimalRuntimeTypeAdapterFactoryA.b(a.b.class, GuestsSelectParameter.TYPE);
        optimalRuntimeTypeAdapterFactoryA.b(a.c.class, SearchParamsConverterKt.SORT);
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(InterfaceC48892c.class, InterfaceC48892c.a.class, "image", InterfaceC48892c.b.class, "sellerInfo");
        optimalRuntimeTypeAdapterFactoryK.b(InterfaceC48892c.C12708c.class, "video");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(i.class);
        optimalRuntimeTypeAdapterFactory.b(i.a.class, "attributedHeader");
        optimalRuntimeTypeAdapterFactory.b(i.b.class, "item");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactory});
        t.d(setL0);
        return setL0;
    }
}
