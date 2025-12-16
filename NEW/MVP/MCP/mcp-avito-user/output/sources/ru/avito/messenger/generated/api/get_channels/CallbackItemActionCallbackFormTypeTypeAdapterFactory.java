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
import ru.avito.messenger.generated.api.get_channels.CallbackItemAction;

/* compiled from: CallbackItemActionCallbackFormTypeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/CallbackItemActionCallbackFormTypeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CallbackItemActionCallbackFormTypeTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CallbackItemActionCallbackFormTypeTypeAdapterFactory implements r {

    /* compiled from: CallbackItemActionCallbackFormTypeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/CallbackItemActionCallbackFormTypeTypeAdapterFactory$CallbackItemActionCallbackFormTypeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/get_channels/CallbackItemAction$CallbackFormType;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallbackItemActionCallbackFormTypeTypeAdapter extends TypeAdapter<CallbackItemAction.CallbackFormType> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<CallbackItemAction.CallbackFormType> f430965a;

        public CallbackItemActionCallbackFormTypeTypeAdapter(@k TypeAdapter<CallbackItemAction.CallbackFormType> typeAdapter) {
            this.f430965a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final CallbackItemAction.CallbackFormType read(a aVar) {
            CallbackItemAction.CallbackFormType callbackFormType = this.f430965a.read(aVar);
            return callbackFormType == null ? CallbackItemAction.CallbackFormType.Unknown : callbackFormType;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, CallbackItemAction.CallbackFormType callbackFormType) {
            this.f430965a.write(cVar, callbackFormType);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), CallbackItemAction.CallbackFormType.class)) {
            return new CallbackItemActionCallbackFormTypeTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(CallbackItemAction.CallbackFormType.class)));
        }
        return null;
    }
}
