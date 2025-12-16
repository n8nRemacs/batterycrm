package ru.avito.messenger.generated.api.get_channel_by_id;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.generated.api.get_channel_by_id.GetChatByIdRequest;

/* compiled from: GetChatByIdRequestCategoryTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/GetChatByIdRequestCategoryTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "GetChatByIdRequestCategoryTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetChatByIdRequestCategoryTypeAdapterFactory implements r {

    /* compiled from: GetChatByIdRequestCategoryTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/GetChatByIdRequestCategoryTypeAdapterFactory$GetChatByIdRequestCategoryTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_channel_by_id/GetChatByIdRequest$Category;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GetChatByIdRequestCategoryTypeAdapter extends TypeAdapter<GetChatByIdRequest.Category> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<GetChatByIdRequest.Category> f430889a;

        public GetChatByIdRequestCategoryTypeAdapter(@k TypeAdapter<GetChatByIdRequest.Category> typeAdapter) {
            this.f430889a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final GetChatByIdRequest.Category read(a aVar) {
            GetChatByIdRequest.Category category = this.f430889a.read(aVar);
            return category == null ? GetChatByIdRequest.Category.Int0 : category;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, GetChatByIdRequest.Category category) throws IOException {
            GetChatByIdRequest.Category category2 = category;
            cVar.p(category2 != null ? Integer.valueOf(category2.f430888b) : null);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), GetChatByIdRequest.Category.class)) {
            return new GetChatByIdRequestCategoryTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(GetChatByIdRequest.Category.class)));
        }
        return null;
    }
}
