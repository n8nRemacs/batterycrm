package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Y61.k;
import Y61.l;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.d;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewEntryV2TypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ReviewEntryV2TypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ReviewEntryV2TypeAdapter", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReviewEntryV2TypeAdapterFactory implements r {

    /* compiled from: ReviewEntryV2TypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ReviewEntryV2TypeAdapterFactory$ReviewEntryV2TypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewEntryV2TypeAdapter extends TypeAdapter<d> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<d> f247588a;

        public ReviewEntryV2TypeAdapter(@k TypeAdapter<d> typeAdapter) {
            this.f247588a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final d read(com.google.gson.stream.a aVar) {
            d dVar = this.f247588a.read(aVar);
            return dVar == null ? d.n.f247592a : dVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, d dVar) {
            this.f247588a.write(cVar, dVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), d.class)) {
            return new ReviewEntryV2TypeAdapter(gson.h(this, com.google.gson.reflect.a.get(d.class)));
        }
        return null;
    }
}
