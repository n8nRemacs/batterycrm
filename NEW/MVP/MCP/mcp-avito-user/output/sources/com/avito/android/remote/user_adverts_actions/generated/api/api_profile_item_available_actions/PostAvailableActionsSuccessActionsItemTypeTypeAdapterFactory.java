package com.avito.android.remote.user_adverts_actions.generated.api.api_profile_item_available_actions;

import Y61.k;
import Y61.l;
import com.avito.android.remote.user_adverts_actions.generated.api.api_profile_item_available_actions.PostAvailableActionsSuccessActionsItem;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PostAvailableActionsSuccessActionsItemTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItemTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "PostAvailableActionsSuccessActionsItemTypeTypeAdapter", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PostAvailableActionsSuccessActionsItemTypeTypeAdapterFactory implements r {

    /* compiled from: PostAvailableActionsSuccessActionsItemTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItemTypeTypeAdapterFactory$PostAvailableActionsSuccessActionsItemTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/user_adverts_actions/generated/api/api_profile_item_available_actions/PostAvailableActionsSuccessActionsItem$Type;", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PostAvailableActionsSuccessActionsItemTypeTypeAdapter extends TypeAdapter<PostAvailableActionsSuccessActionsItem.Type> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<PostAvailableActionsSuccessActionsItem.Type> f254388a;

        public PostAvailableActionsSuccessActionsItemTypeTypeAdapter(@k TypeAdapter<PostAvailableActionsSuccessActionsItem.Type> typeAdapter) {
            this.f254388a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final PostAvailableActionsSuccessActionsItem.Type read(a aVar) {
            PostAvailableActionsSuccessActionsItem.Type type = this.f254388a.read(aVar);
            return type == null ? PostAvailableActionsSuccessActionsItem.Type.Default : type;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, PostAvailableActionsSuccessActionsItem.Type type) {
            this.f254388a.write(cVar, type);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), PostAvailableActionsSuccessActionsItem.Type.class)) {
            return new PostAvailableActionsSuccessActionsItemTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(PostAvailableActionsSuccessActionsItem.Type.class)));
        }
        return null;
    }
}
