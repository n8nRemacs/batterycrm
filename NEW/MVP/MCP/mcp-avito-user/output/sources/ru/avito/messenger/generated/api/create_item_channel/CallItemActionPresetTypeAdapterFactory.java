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
import ru.avito.messenger.generated.api.create_item_channel.CallItemAction;

/* compiled from: CallItemActionPresetTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/CallItemActionPresetTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CallItemActionPresetTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CallItemActionPresetTypeAdapterFactory implements r {

    /* compiled from: CallItemActionPresetTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/CallItemActionPresetTypeAdapterFactory$CallItemActionPresetTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/CallItemAction$Preset;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallItemActionPresetTypeAdapter extends TypeAdapter<CallItemAction.Preset> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<CallItemAction.Preset> f430769a;

        public CallItemActionPresetTypeAdapter(@k TypeAdapter<CallItemAction.Preset> typeAdapter) {
            this.f430769a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final CallItemAction.Preset read(a aVar) {
            CallItemAction.Preset preset = this.f430769a.read(aVar);
            return preset == null ? CallItemAction.Preset.Unknown : preset;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, CallItemAction.Preset preset) {
            this.f430769a.write(cVar, preset);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), CallItemAction.Preset.class)) {
            return new CallItemActionPresetTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(CallItemAction.Preset.class)));
        }
        return null;
    }
}
