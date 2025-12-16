package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Y61.k;
import Y61.l;
import com.avito.android.rating.generated.api.api_11_profile_ratings_get.c;
import com.avito.android.remote.model.Image;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewEntityV2AvatarApiTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ReviewEntityV2AvatarApiTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ReviewEntityV2AvatarApiTypeAdapter", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReviewEntityV2AvatarApiTypeAdapterFactory implements r {

    /* compiled from: ReviewEntityV2AvatarApiTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ReviewEntityV2AvatarApiTypeAdapterFactory$ReviewEntityV2AvatarApiTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c$a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewEntityV2AvatarApiTypeAdapter extends TypeAdapter<c.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Image> f247586a;

        public ReviewEntityV2AvatarApiTypeAdapter(@k TypeAdapter<Image> typeAdapter) {
            this.f247586a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final c.a read(com.google.gson.stream.a aVar) {
            return new c.a(this.f247586a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, c.a aVar) {
            Image api = aVar.getApi();
            if (api == null) {
                return;
            }
            this.f247586a.write(cVar, api);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), c.a.class)) {
            return new ReviewEntityV2AvatarApiTypeAdapter(gson.g(Image.class));
        }
        return null;
    }
}
