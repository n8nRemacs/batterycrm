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

/* compiled from: CallItemActionScenarioTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/CallItemActionScenarioTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "CallItemActionScenarioTypeAdapter", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CallItemActionScenarioTypeAdapterFactory implements r {

    /* compiled from: CallItemActionScenarioTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/CallItemActionScenarioTypeAdapterFactory$CallItemActionScenarioTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lru/avito/messenger/generated/api/create_item_channel/CallItemAction$Scenario;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallItemActionScenarioTypeAdapter extends TypeAdapter<CallItemAction.Scenario> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<CallItemAction.Scenario> f430770a;

        public CallItemActionScenarioTypeAdapter(@k TypeAdapter<CallItemAction.Scenario> typeAdapter) {
            this.f430770a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final CallItemAction.Scenario read(a aVar) {
            CallItemAction.Scenario scenario = this.f430770a.read(aVar);
            return scenario == null ? CallItemAction.Scenario.Unknown : scenario;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, CallItemAction.Scenario scenario) {
            this.f430770a.write(cVar, scenario);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), CallItemAction.Scenario.class)) {
            return new CallItemActionScenarioTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(CallItemAction.Scenario.class)));
        }
        return null;
    }
}
