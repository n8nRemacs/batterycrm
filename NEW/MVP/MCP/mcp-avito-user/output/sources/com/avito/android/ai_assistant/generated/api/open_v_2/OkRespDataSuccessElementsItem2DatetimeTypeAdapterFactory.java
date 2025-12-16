package com.avito.android.ai_assistant.generated.api.open_v_2;

import Y61.k;
import Y61.l;
import com.avito.android.ai_assistant.generated.api.open_v_2.OkRespDataSuccessElementsItem2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OkRespDataSuccessElementsItem2DatetimeTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2DatetimeTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "OkRespDataSuccessElementsItem2DatetimeTypeAdapter", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OkRespDataSuccessElementsItem2DatetimeTypeAdapterFactory implements r {

    /* compiled from: OkRespDataSuccessElementsItem2DatetimeTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2DatetimeTypeAdapterFactory$OkRespDataSuccessElementsItem2DatetimeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2$a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessElementsItem2DatetimeTypeAdapter extends TypeAdapter<OkRespDataSuccessElementsItem2.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<String> f89056a;

        public OkRespDataSuccessElementsItem2DatetimeTypeAdapter(@k TypeAdapter<String> typeAdapter) {
            this.f89056a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final OkRespDataSuccessElementsItem2.a read(com.google.gson.stream.a aVar) {
            return new OkRespDataSuccessElementsItem2.a(this.f89056a.read(aVar));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, OkRespDataSuccessElementsItem2.a aVar) {
            String datetime = aVar.getDatetime();
            if (datetime == null) {
                return;
            }
            this.f89056a.write(cVar, datetime);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), OkRespDataSuccessElementsItem2.a.class)) {
            return new OkRespDataSuccessElementsItem2DatetimeTypeAdapter(gson.g(String.class));
        }
        return null;
    }
}
