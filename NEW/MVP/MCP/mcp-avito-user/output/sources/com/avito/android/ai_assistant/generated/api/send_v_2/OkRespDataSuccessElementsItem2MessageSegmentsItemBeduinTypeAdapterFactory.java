package com.avito.android.ai_assistant.generated.api.send_v_2;

import Y61.k;
import Y61.l;
import com.avito.android.ai_assistant.generated.api.send_v_2.a;
import com.avito.android.remote.model.BeduinV2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapter", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapterFactory implements r {

    /* compiled from: OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapterFactory$OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/a$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapter extends TypeAdapter<a.b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<BeduinV2> f89082a;

        public OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapter(@k TypeAdapter<BeduinV2> typeAdapter) {
            this.f89082a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.b read(com.google.gson.stream.a aVar) {
            return new a.b(this.f89082a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, a.b bVar) {
            BeduinV2 beduin = bVar.getBeduin();
            if (beduin == null) {
                return;
            }
            this.f89082a.write(cVar, beduin);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.b.class)) {
            return new OkRespDataSuccessElementsItem2MessageSegmentsItemBeduinTypeAdapter(gson.g(BeduinV2.class));
        }
        return null;
    }
}
