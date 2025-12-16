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
import ru.avito.messenger.generated.api.send_text_message.CallbackItemAction;

/* compiled from: CallbackItemActionPresetTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/CallbackItemActionPresetTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CallbackItemActionPresetTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CallbackItemActionPresetTypeAdapterFactory implements r {

    /* compiled from: CallbackItemActionPresetTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/CallbackItemActionPresetTypeAdapterFactory$CallbackItemActionPresetTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/send_text_message/CallbackItemAction$Preset;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallbackItemActionPresetTypeAdapter extends TypeAdapter<CallbackItemAction.Preset> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<CallbackItemAction.Preset> f431135a;

        public CallbackItemActionPresetTypeAdapter(@k TypeAdapter<CallbackItemAction.Preset> typeAdapter) {
            this.f431135a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final CallbackItemAction.Preset read(a aVar) {
            CallbackItemAction.Preset preset = this.f431135a.read(aVar);
            return preset == null ? CallbackItemAction.Preset.Unknown : preset;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, CallbackItemAction.Preset preset) {
            this.f431135a.write(cVar, preset);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), CallbackItemAction.Preset.class)) {
            return new CallbackItemActionPresetTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(CallbackItemAction.Preset.class)));
        }
        return null;
    }
}
