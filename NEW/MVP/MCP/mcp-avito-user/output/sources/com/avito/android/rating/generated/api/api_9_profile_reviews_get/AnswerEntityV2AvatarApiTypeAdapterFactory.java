package com.avito.android.rating.generated.api.api_9_profile_reviews_get;

import Y61.k;
import Y61.l;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.a;
import com.avito.android.remote.model.Image;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnswerEntityV2AvatarApiTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2AvatarApiTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "AnswerEntityV2AvatarApiTypeAdapter", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnswerEntityV2AvatarApiTypeAdapterFactory implements r {

    /* compiled from: AnswerEntityV2AvatarApiTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2AvatarApiTypeAdapterFactory$AnswerEntityV2AvatarApiTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/a$a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnswerEntityV2AvatarApiTypeAdapter extends TypeAdapter<a.C7428a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Image> f247597a;

        public AnswerEntityV2AvatarApiTypeAdapter(@k TypeAdapter<Image> typeAdapter) {
            this.f247597a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.C7428a read(com.google.gson.stream.a aVar) {
            return new a.C7428a(this.f247597a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, a.C7428a c7428a) {
            Image api = c7428a.getApi();
            if (api == null) {
                return;
            }
            this.f247597a.write(cVar, api);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.C7428a.class)) {
            return new AnswerEntityV2AvatarApiTypeAdapter(gson.g(Image.class));
        }
        return null;
    }
}
