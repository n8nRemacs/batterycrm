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
import ru.avito.messenger.generated.api.create_item_channel.BaseItemAction;

/* compiled from: BaseItemActionPresetTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/BaseItemActionPresetTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "BaseItemActionPresetTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BaseItemActionPresetTypeAdapterFactory implements r {

    /* compiled from: BaseItemActionPresetTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/BaseItemActionPresetTypeAdapterFactory$BaseItemActionPresetTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/BaseItemAction$Preset;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BaseItemActionPresetTypeAdapter extends TypeAdapter<BaseItemAction.Preset> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<BaseItemAction.Preset> f430760a;

        public BaseItemActionPresetTypeAdapter(@k TypeAdapter<BaseItemAction.Preset> typeAdapter) {
            this.f430760a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final BaseItemAction.Preset read(a aVar) {
            BaseItemAction.Preset preset = this.f430760a.read(aVar);
            return preset == null ? BaseItemAction.Preset.Unknown : preset;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, BaseItemAction.Preset preset) {
            this.f430760a.write(cVar, preset);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), BaseItemAction.Preset.class)) {
            return new BaseItemActionPresetTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(BaseItemAction.Preset.class)));
        }
        return null;
    }
}
