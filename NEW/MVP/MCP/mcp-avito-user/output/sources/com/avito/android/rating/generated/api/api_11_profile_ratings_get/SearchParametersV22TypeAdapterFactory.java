package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Y61.k;
import Y61.l;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchParametersV22TypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/SearchParametersV22TypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "SearchParametersV22TypeAdapter", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SearchParametersV22TypeAdapterFactory implements r {

    /* compiled from: SearchParametersV22TypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/SearchParametersV22TypeAdapterFactory$SearchParametersV22TypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SearchParametersV22TypeAdapter extends TypeAdapter<e> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<e> f247589a;

        public SearchParametersV22TypeAdapter(@k TypeAdapter<e> typeAdapter) {
            this.f247589a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final e read(com.google.gson.stream.a aVar) {
            e eVar = this.f247589a.read(aVar);
            return eVar == null ? e.c.f247593a : eVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, e eVar) {
            this.f247589a.write(cVar, eVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), e.class)) {
            return new SearchParametersV22TypeAdapter(gson.h(this, com.google.gson.reflect.a.get(e.class)));
        }
        return null;
    }
}
