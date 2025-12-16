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

/* compiled from: HeaderTitleButtonNullableIconMobileNullableTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/HeaderTitleButtonNullableIconMobileNullableTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "HeaderTitleButtonNullableIconMobileNullableTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HeaderTitleButtonNullableIconMobileNullableTypeAdapterFactory implements r {

    /* compiled from: HeaderTitleButtonNullableIconMobileNullableTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/HeaderTitleButtonNullableIconMobileNullableTypeAdapterFactory$HeaderTitleButtonNullableIconMobileNullableTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/HeaderTitleButtonNullable$IconMobileNullable;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HeaderTitleButtonNullableIconMobileNullableTypeAdapter extends TypeAdapter<HeaderTitleButtonNullable.IconMobileNullable> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<HeaderTitleButtonNullable.IconMobileNullable> f430801a;

        public HeaderTitleButtonNullableIconMobileNullableTypeAdapter(@k TypeAdapter<HeaderTitleButtonNullable.IconMobileNullable> typeAdapter) {
            this.f430801a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final HeaderTitleButtonNullable.IconMobileNullable read(a aVar) {
            if (aVar.F() == JsonToken.f362204j) {
                aVar.z();
                return null;
            }
            HeaderTitleButtonNullable.IconMobileNullable iconMobileNullable = this.f430801a.read(aVar);
            return iconMobileNullable == null ? HeaderTitleButtonNullable.IconMobileNullable.Unknown : iconMobileNullable;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, HeaderTitleButtonNullable.IconMobileNullable iconMobileNullable) {
            this.f430801a.write(cVar, iconMobileNullable);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), HeaderTitleButtonNullable.IconMobileNullable.class)) {
            return new HeaderTitleButtonNullableIconMobileNullableTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(HeaderTitleButtonNullable.IconMobileNullable.class)));
        }
        return null;
    }
}
