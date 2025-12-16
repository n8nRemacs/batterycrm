package com.avito.android.ai_assistant.generated.api.open_v_2;

import Y61.k;
import Y61.l;
import com.avito.android.ai_assistant.generated.api.open_v_2.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapter", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapterFactory implements r {

    /* compiled from: OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapterFactory$OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapter extends TypeAdapter<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<b> f89057a;

        public OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapter(@k TypeAdapter<b> typeAdapter) {
            this.f89057a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final b read(com.google.gson.stream.a aVar) {
            b bVar = this.f89057a.read(aVar);
            return bVar == null ? b.e.f89066a : bVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, b bVar) {
            this.f89057a.write(cVar, bVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), b.class)) {
            return new OkRespDataSuccessElementsItem2MessageSegmentsItemActionsItemTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(b.class)));
        }
        return null;
    }
}
