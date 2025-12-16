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
import ru.avito.messenger.generated.api.create_item_channel.Chunk;

/* compiled from: ChunkTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/ChunkTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "ChunkTypeTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChunkTypeTypeAdapterFactory implements r {

    /* compiled from: ChunkTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/ChunkTypeTypeAdapterFactory$ChunkTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/Chunk$Type;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChunkTypeTypeAdapter extends TypeAdapter<Chunk.Type> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Chunk.Type> f430791a;

        public ChunkTypeTypeAdapter(@k TypeAdapter<Chunk.Type> typeAdapter) {
            this.f430791a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Chunk.Type read(a aVar) {
            Chunk.Type type = this.f430791a.read(aVar);
            return type == null ? Chunk.Type.Int0 : type;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, Chunk.Type type) {
            this.f430791a.write(cVar, type);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), Chunk.Type.class)) {
            return new ChunkTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(Chunk.Type.class)));
        }
        return null;
    }
}
