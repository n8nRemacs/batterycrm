package ru.avito.messenger.generated.api.get_channels;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.generated.api.get_channels.MessageBodyAppCallNullable;

/* compiled from: MessageBodyAppCallNullableDirectionTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/MessageBodyAppCallNullableDirectionTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "MessageBodyAppCallNullableDirectionTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageBodyAppCallNullableDirectionTypeAdapterFactory implements r {

    /* compiled from: MessageBodyAppCallNullableDirectionTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/MessageBodyAppCallNullableDirectionTypeAdapterFactory$MessageBodyAppCallNullableDirectionTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_channels/MessageBodyAppCallNullable$Direction;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MessageBodyAppCallNullableDirectionTypeAdapter extends TypeAdapter<MessageBodyAppCallNullable.Direction> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<MessageBodyAppCallNullable.Direction> f431007a;

        public MessageBodyAppCallNullableDirectionTypeAdapter(@k TypeAdapter<MessageBodyAppCallNullable.Direction> typeAdapter) {
            this.f431007a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final MessageBodyAppCallNullable.Direction read(a aVar) {
            MessageBodyAppCallNullable.Direction direction = this.f431007a.read(aVar);
            return direction == null ? MessageBodyAppCallNullable.Direction.None : direction;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, MessageBodyAppCallNullable.Direction direction) {
            this.f431007a.write(cVar, direction);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), MessageBodyAppCallNullable.Direction.class)) {
            return new MessageBodyAppCallNullableDirectionTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(MessageBodyAppCallNullable.Direction.class)));
        }
        return null;
    }
}
