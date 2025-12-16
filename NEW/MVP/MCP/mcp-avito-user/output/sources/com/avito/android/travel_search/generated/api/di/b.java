package com.avito.android.travel_search.generated.api.di;

import com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.FilterValueGuestsSelectTypeAdapterFactory;
import com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.FilterValueSortTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;

/* compiled from: TravelSearchJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes4.dex */
public final class b implements h<Set<r>> {

    /* compiled from: TravelSearchJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f303122a = new b();
    }

    public static b a() {
        return a.f303122a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.travel_search.generated.api.di.a.f303121a.getClass();
        Set setL0 = C42756l.l0(new r[]{new FilterValueGuestsSelectTypeAdapterFactory(), new FilterValueSortTypeAdapterFactory()});
        t.d(setL0);
        return setL0;
    }
}
