package com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post;

import Y61.k;
import Y61.l;
import com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FilterValueSortTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/FilterValueSortTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "FilterValueSortTypeAdapter", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FilterValueSortTypeAdapterFactory implements r {

    /* compiled from: FilterValueSortTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/FilterValueSortTypeAdapterFactory$FilterValueSortTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$c;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FilterValueSortTypeAdapter extends TypeAdapter<a.c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<String> f303117a;

        public FilterValueSortTypeAdapter(@k TypeAdapter<String> typeAdapter) {
            this.f303117a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.c read(com.google.gson.stream.a aVar) {
            return new a.c(this.f303117a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a.c cVar2) {
            String sort = cVar2.getSort();
            if (sort == null) {
                return;
            }
            this.f303117a.write(cVar, sort);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.c.class)) {
            return new FilterValueSortTypeAdapter(gson.g(String.class));
        }
        return null;
    }
}
