package ru.avito.messenger.generated.api.send_text_message;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.generated.api.send_text_message.MessageBodyAppCallNullable;

/* compiled from: MessageBodyAppCallNullableStatusTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullableStatusTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "MessageBodyAppCallNullableStatusTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageBodyAppCallNullableStatusTypeAdapterFactory implements r {

    /* compiled from: MessageBodyAppCallNullableStatusTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullableStatusTypeAdapterFactory$MessageBodyAppCallNullableStatusTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/send_text_message/MessageBodyAppCallNullable$Status;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MessageBodyAppCallNullableStatusTypeAdapter extends TypeAdapter<MessageBodyAppCallNullable.Status> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<MessageBodyAppCallNullable.Status> f431157a;

        public MessageBodyAppCallNullableStatusTypeAdapter(@k TypeAdapter<MessageBodyAppCallNullable.Status> typeAdapter) {
            this.f431157a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final MessageBodyAppCallNullable.Status read(a aVar) {
            MessageBodyAppCallNullable.Status status = this.f431157a.read(aVar);
            return status == null ? MessageBodyAppCallNullable.Status.Unknown : status;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, MessageBodyAppCallNullable.Status status) {
            this.f431157a.write(cVar, status);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), MessageBodyAppCallNullable.Status.class)) {
            return new MessageBodyAppCallNullableStatusTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(MessageBodyAppCallNullable.Status.class)));
        }
        return null;
    }
}
