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
import ru.avito.messenger.generated.api.get_channels.Attribute;

/* compiled from: AttributeTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/AttributeTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "AttributeTypeTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributeTypeTypeAdapterFactory implements r {

    /* compiled from: AttributeTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/AttributeTypeTypeAdapterFactory$AttributeTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_channels/Attribute$Type;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AttributeTypeTypeAdapter extends TypeAdapter<Attribute.Type> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Attribute.Type> f430940a;

        public AttributeTypeTypeAdapter(@k TypeAdapter<Attribute.Type> typeAdapter) {
            this.f430940a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Attribute.Type read(a aVar) {
            Attribute.Type type = this.f430940a.read(aVar);
            return type == null ? Attribute.Type.Int0 : type;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, Attribute.Type type) {
            this.f430940a.write(cVar, type);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), Attribute.Type.class)) {
            return new AttributeTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(Attribute.Type.class)));
        }
        return null;
    }
}
