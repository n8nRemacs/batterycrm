package com.avito.android.ai_assistant.generated.api.open_v_2;

import Y61.k;
import Y61.l;
import com.avito.android.ai_assistant.generated.api.open_v_2.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapter", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapterFactory implements r {

    /* compiled from: OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapterFactory$OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/a$a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapter extends TypeAdapter<a.C2635a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<List<b>> f89058a;

        public OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapter(@k TypeAdapter<List<b>> typeAdapter) {
            this.f89058a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a.C2635a read(com.google.gson.stream.a aVar) {
            return new a.C2635a(this.f89058a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, a.C2635a c2635a) {
            List<b> listA = c2635a.a();
            if (listA == null) {
                return;
            }
            this.f89058a.write(cVar, listA);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.C2635a.class)) {
            return new OkRespDataSuccessElementsItem2MessageSegmentsItemActionsTypeAdapter(gson.f(com.google.gson.reflect.a.getParameterized(List.class, b.class)));
        }
        return null;
    }
}
