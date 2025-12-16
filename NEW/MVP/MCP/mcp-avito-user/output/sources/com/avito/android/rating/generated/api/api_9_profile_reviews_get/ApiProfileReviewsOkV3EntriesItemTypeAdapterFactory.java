package com.avito.android.rating.generated.api.api_9_profile_reviews_get;

import Y61.k;
import Y61.l;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiProfileReviewsOkV3EntriesItemTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/ApiProfileReviewsOkV3EntriesItemTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ApiProfileReviewsOkV3EntriesItemTypeAdapter", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ApiProfileReviewsOkV3EntriesItemTypeAdapterFactory implements r {

    /* compiled from: ApiProfileReviewsOkV3EntriesItemTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/ApiProfileReviewsOkV3EntriesItemTypeAdapterFactory$ApiProfileReviewsOkV3EntriesItemTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApiProfileReviewsOkV3EntriesItemTypeAdapter extends TypeAdapter<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<b> f247601a;

        public ApiProfileReviewsOkV3EntriesItemTypeAdapter(@k TypeAdapter<b> typeAdapter) {
            this.f247601a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final b read(com.google.gson.stream.a aVar) {
            b bVar = this.f247601a.read(aVar);
            return bVar == null ? b.d.f247610a : bVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, b bVar) {
            this.f247601a.write(cVar, bVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), b.class)) {
            return new ApiProfileReviewsOkV3EntriesItemTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(b.class)));
        }
        return null;
    }
}
