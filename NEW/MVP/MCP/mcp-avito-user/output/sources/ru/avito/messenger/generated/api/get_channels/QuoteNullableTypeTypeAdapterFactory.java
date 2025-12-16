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
import ru.avito.messenger.generated.api.get_channels.QuoteNullable;

/* compiled from: QuoteNullableTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/QuoteNullableTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "QuoteNullableTypeTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class QuoteNullableTypeTypeAdapterFactory implements r {

    /* compiled from: QuoteNullableTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/QuoteNullableTypeTypeAdapterFactory$QuoteNullableTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_channels/QuoteNullable$Type;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class QuoteNullableTypeTypeAdapter extends TypeAdapter<QuoteNullable.Type> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<QuoteNullable.Type> f431023a;

        public QuoteNullableTypeTypeAdapter(@k TypeAdapter<QuoteNullable.Type> typeAdapter) {
            this.f431023a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final QuoteNullable.Type read(a aVar) {
            QuoteNullable.Type type = this.f431023a.read(aVar);
            return type == null ? QuoteNullable.Type.Int0 : type;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, QuoteNullable.Type type) {
            this.f431023a.write(cVar, type);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), QuoteNullable.Type.class)) {
            return new QuoteNullableTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(QuoteNullable.Type.class)));
        }
        return null;
    }
}
