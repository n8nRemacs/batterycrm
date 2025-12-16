package com.avito.android.rating.generated.api.api_9_profile_reviews_get;

import Y61.k;
import Y61.l;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapter", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapterFactory implements r {

    /* compiled from: ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapterFactory$ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapter extends TypeAdapter<b.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Ig0.k> f247599a;

        public ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapter(@k TypeAdapter<Ig0.k> typeAdapter) {
            this.f247599a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final b.a read(com.google.gson.stream.a aVar) {
            return new b.a(this.f247599a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, b.a aVar) {
            Ig0.k buyer = aVar.getBuyer();
            if (buyer == null) {
                return;
            }
            this.f247599a.write(cVar, buyer);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), b.a.class)) {
            return new ApiProfileReviewsOkV3EntriesItemBuyerTypeAdapter(gson.g(Ig0.k.class));
        }
        return null;
    }
}
