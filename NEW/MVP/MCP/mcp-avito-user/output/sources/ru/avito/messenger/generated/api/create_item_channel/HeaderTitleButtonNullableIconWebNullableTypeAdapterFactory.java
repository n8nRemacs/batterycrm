package ru.avito.messenger.generated.api.create_item_channel;

import Y61.k;
import Y61.l;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.generated.api.create_item_channel.HeaderTitleButtonNullable;

/* compiled from: HeaderTitleButtonNullableIconWebNullableTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/HeaderTitleButtonNullableIconWebNullableTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "HeaderTitleButtonNullableIconWebNullableTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HeaderTitleButtonNullableIconWebNullableTypeAdapterFactory implements r {

    /* compiled from: HeaderTitleButtonNullableIconWebNullableTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/HeaderTitleButtonNullableIconWebNullableTypeAdapterFactory$HeaderTitleButtonNullableIconWebNullableTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/HeaderTitleButtonNullable$IconWebNullable;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HeaderTitleButtonNullableIconWebNullableTypeAdapter extends TypeAdapter<HeaderTitleButtonNullable.IconWebNullable> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<HeaderTitleButtonNullable.IconWebNullable> f430802a;

        public HeaderTitleButtonNullableIconWebNullableTypeAdapter(@k TypeAdapter<HeaderTitleButtonNullable.IconWebNullable> typeAdapter) {
            this.f430802a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final HeaderTitleButtonNullable.IconWebNullable read(a aVar) {
            if (aVar.F() == JsonToken.f362204j) {
                aVar.z();
                return null;
            }
            HeaderTitleButtonNullable.IconWebNullable iconWebNullable = this.f430802a.read(aVar);
            return iconWebNullable == null ? HeaderTitleButtonNullable.IconWebNullable.Unknown : iconWebNullable;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, HeaderTitleButtonNullable.IconWebNullable iconWebNullable) {
            this.f430802a.write(cVar, iconWebNullable);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), HeaderTitleButtonNullable.IconWebNullable.class)) {
            return new HeaderTitleButtonNullableIconWebNullableTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(HeaderTitleButtonNullable.IconWebNullable.class)));
        }
        return null;
    }
}
