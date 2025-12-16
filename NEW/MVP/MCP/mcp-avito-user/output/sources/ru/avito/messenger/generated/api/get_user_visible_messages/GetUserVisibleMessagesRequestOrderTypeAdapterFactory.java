package ru.avito.messenger.generated.api.get_user_visible_messages;

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
import ru.avito.messenger.generated.api.get_user_visible_messages.GetUserVisibleMessagesRequest;

/* compiled from: GetUserVisibleMessagesRequestOrderTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequestOrderTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "GetUserVisibleMessagesRequestOrderTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetUserVisibleMessagesRequestOrderTypeAdapterFactory implements r {

    /* compiled from: GetUserVisibleMessagesRequestOrderTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequestOrderTypeAdapterFactory$GetUserVisibleMessagesRequestOrderTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest$Order;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GetUserVisibleMessagesRequestOrderTypeAdapter extends TypeAdapter<GetUserVisibleMessagesRequest.Order> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<GetUserVisibleMessagesRequest.Order> f431066a;

        public GetUserVisibleMessagesRequestOrderTypeAdapter(@k TypeAdapter<GetUserVisibleMessagesRequest.Order> typeAdapter) {
            this.f431066a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final GetUserVisibleMessagesRequest.Order read(a aVar) {
            GetUserVisibleMessagesRequest.Order order = this.f431066a.read(aVar);
            return order == null ? GetUserVisibleMessagesRequest.Order.Int0 : order;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, GetUserVisibleMessagesRequest.Order order) throws IOException {
            GetUserVisibleMessagesRequest.Order order2 = order;
            cVar.p(order2 != null ? Integer.valueOf(order2.f431065b) : null);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), GetUserVisibleMessagesRequest.Order.class)) {
            return new GetUserVisibleMessagesRequestOrderTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(GetUserVisibleMessagesRequest.Order.class)));
        }
        return null;
    }
}
