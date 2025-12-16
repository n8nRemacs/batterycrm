package com.avito.android.ai_assistant.generated.api.open_v_2;

import Y61.k;
import Y61.l;
import com.avito.android.ai_assistant.generated.api.open_v_2.OkRespDataSuccessElementsItem2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OkRespDataSuccessElementsItem2TypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2TypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "OkRespDataSuccessElementsItem2TypeAdapter", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OkRespDataSuccessElementsItem2TypeAdapterFactory implements r {

    /* compiled from: OkRespDataSuccessElementsItem2TypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2TypeAdapterFactory$OkRespDataSuccessElementsItem2TypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessElementsItem2TypeAdapter extends TypeAdapter<OkRespDataSuccessElementsItem2> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<OkRespDataSuccessElementsItem2> f89063a;

        public OkRespDataSuccessElementsItem2TypeAdapter(@k TypeAdapter<OkRespDataSuccessElementsItem2> typeAdapter) {
            this.f89063a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final OkRespDataSuccessElementsItem2 read(com.google.gson.stream.a aVar) {
            OkRespDataSuccessElementsItem2 okRespDataSuccessElementsItem2 = this.f89063a.read(aVar);
            return okRespDataSuccessElementsItem2 == null ? OkRespDataSuccessElementsItem2.b.f89055a : okRespDataSuccessElementsItem2;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(com.google.gson.stream.c cVar, OkRespDataSuccessElementsItem2 okRespDataSuccessElementsItem2) {
            this.f89063a.write(cVar, okRespDataSuccessElementsItem2);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), OkRespDataSuccessElementsItem2.class)) {
            return new OkRespDataSuccessElementsItem2TypeAdapter(gson.h(this, com.google.gson.reflect.a.get(OkRespDataSuccessElementsItem2.class)));
        }
        return null;
    }
}
