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

/* compiled from: FilterValueGuestsSelectTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/FilterValueGuestsSelectTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "FilterValueGuestsSelectTypeAdapter", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FilterValueGuestsSelectTypeAdapterFactory implements r {

    /* compiled from: FilterValueGuestsSelectTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/FilterValueGuestsSelectTypeAdapterFactory$FilterValueGuestsSelectTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/a$b;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FilterValueGuestsSelectTypeAdapter extends TypeAdapter<a.b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<String> f303116a;

        public FilterValueGuestsSelectTypeAdapter(@k TypeAdapter<String> typeAdapter) {
            this.f303116a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.b read(com.google.gson.stream.a aVar) {
            return new a.b(this.f303116a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a.b bVar) {
            String guestsSelect = bVar.getGuestsSelect();
            if (guestsSelect == null) {
                return;
            }
            this.f303116a.write(cVar, guestsSelect);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.b.class)) {
            return new FilterValueGuestsSelectTypeAdapter(gson.g(String.class));
        }
        return null;
    }
}
