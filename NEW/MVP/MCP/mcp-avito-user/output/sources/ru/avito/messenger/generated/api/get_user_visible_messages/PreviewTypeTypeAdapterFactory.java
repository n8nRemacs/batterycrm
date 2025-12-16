package ru.avito.messenger.generated.api.get_user_visible_messages;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.generated.api.get_user_visible_messages.Preview;

/* compiled from: PreviewTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/PreviewTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "PreviewTypeTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PreviewTypeTypeAdapterFactory implements r {

    /* compiled from: PreviewTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/PreviewTypeTypeAdapterFactory$PreviewTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_user_visible_messages/Preview$Type;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PreviewTypeTypeAdapter extends TypeAdapter<Preview.Type> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<Preview.Type> f431091a;

        public PreviewTypeTypeAdapter(@k TypeAdapter<Preview.Type> typeAdapter) {
            this.f431091a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Preview.Type read(a aVar) {
            Preview.Type type = this.f431091a.read(aVar);
            return type == null ? Preview.Type.Int0 : type;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, Preview.Type type) {
            this.f431091a.write(cVar, type);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), Preview.Type.class)) {
            return new PreviewTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(Preview.Type.class)));
        }
        return null;
    }
}
