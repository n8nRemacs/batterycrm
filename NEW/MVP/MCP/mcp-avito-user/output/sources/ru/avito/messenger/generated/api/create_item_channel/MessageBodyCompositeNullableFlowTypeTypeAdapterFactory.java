package ru.avito.messenger.generated.api.create_item_channel;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.generated.api.create_item_channel.MessageBodyCompositeNullable;

/* compiled from: MessageBodyCompositeNullableFlowTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/MessageBodyCompositeNullableFlowTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "MessageBodyCompositeNullableFlowTypeTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageBodyCompositeNullableFlowTypeTypeAdapterFactory implements r {

    /* compiled from: MessageBodyCompositeNullableFlowTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/MessageBodyCompositeNullableFlowTypeTypeAdapterFactory$MessageBodyCompositeNullableFlowTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/MessageBodyCompositeNullable$FlowType;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MessageBodyCompositeNullableFlowTypeTypeAdapter extends TypeAdapter<MessageBodyCompositeNullable.FlowType> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<MessageBodyCompositeNullable.FlowType> f430824a;

        public MessageBodyCompositeNullableFlowTypeTypeAdapter(@k TypeAdapter<MessageBodyCompositeNullable.FlowType> typeAdapter) {
            this.f430824a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final MessageBodyCompositeNullable.FlowType read(a aVar) {
            MessageBodyCompositeNullable.FlowType flowType = this.f430824a.read(aVar);
            return flowType == null ? MessageBodyCompositeNullable.FlowType.Int0 : flowType;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, MessageBodyCompositeNullable.FlowType flowType) {
            this.f430824a.write(cVar, flowType);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), MessageBodyCompositeNullable.FlowType.class)) {
            return new MessageBodyCompositeNullableFlowTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(MessageBodyCompositeNullable.FlowType.class)));
        }
        return null;
    }
}
