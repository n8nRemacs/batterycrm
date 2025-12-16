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
import ru.avito.messenger.generated.api.get_user_visible_messages.CallbackItemAction;

/* compiled from: CallbackItemActionStyleTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/CallbackItemActionStyleTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CallbackItemActionStyleTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CallbackItemActionStyleTypeAdapterFactory implements r {

    /* compiled from: CallbackItemActionStyleTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/CallbackItemActionStyleTypeAdapterFactory$CallbackItemActionStyleTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_user_visible_messages/CallbackItemAction$Style;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallbackItemActionStyleTypeAdapter extends TypeAdapter<CallbackItemAction.Style> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<CallbackItemAction.Style> f431059a;

        public CallbackItemActionStyleTypeAdapter(@k TypeAdapter<CallbackItemAction.Style> typeAdapter) {
            this.f431059a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final CallbackItemAction.Style read(a aVar) {
            CallbackItemAction.Style style = this.f431059a.read(aVar);
            return style == null ? CallbackItemAction.Style.Unknown : style;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, CallbackItemAction.Style style) {
            this.f431059a.write(cVar, style);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), CallbackItemAction.Style.class)) {
            return new CallbackItemActionStyleTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(CallbackItemAction.Style.class)));
        }
        return null;
    }
}
