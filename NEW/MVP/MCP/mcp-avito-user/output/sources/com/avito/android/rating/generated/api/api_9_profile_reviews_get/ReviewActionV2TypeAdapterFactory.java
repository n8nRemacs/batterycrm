package com.avito.android.rating.generated.api.api_9_profile_reviews_get;

import Y61.k;
import Y61.l;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.f;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewActionV2TypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/ReviewActionV2TypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ReviewActionV2TypeAdapter", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReviewActionV2TypeAdapterFactory implements r {

    /* compiled from: ReviewActionV2TypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/ReviewActionV2TypeAdapterFactory$ReviewActionV2TypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/f;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewActionV2TypeAdapter extends TypeAdapter<f> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<f> f247608a;

        public ReviewActionV2TypeAdapter(@k TypeAdapter<f> typeAdapter) {
            this.f247608a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final f read(com.google.gson.stream.a aVar) {
            f fVar = this.f247608a.read(aVar);
            return fVar == null ? f.l.f247611a : fVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, f fVar) {
            this.f247608a.write(cVar, fVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), f.class)) {
            return new ReviewActionV2TypeAdapter(gson.h(this, com.google.gson.reflect.a.get(f.class)));
        }
        return null;
    }
}
