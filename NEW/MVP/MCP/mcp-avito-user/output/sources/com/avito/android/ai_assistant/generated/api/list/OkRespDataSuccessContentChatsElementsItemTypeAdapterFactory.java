package com.avito.android.ai_assistant.generated.api.list;

import Y61.k;
import Y61.l;
import com.avito.android.ai_assistant.generated.api.list.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.stream.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OkRespDataSuccessContentChatsElementsItemTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/list/OkRespDataSuccessContentChatsElementsItemTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "OkRespDataSuccessContentChatsElementsItemTypeAdapter", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OkRespDataSuccessContentChatsElementsItemTypeAdapterFactory implements r {

    /* compiled from: OkRespDataSuccessContentChatsElementsItemTypeAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/list/OkRespDataSuccessContentChatsElementsItemTypeAdapterFactory$OkRespDataSuccessContentChatsElementsItemTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/ai_assistant/generated/api/list/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OkRespDataSuccessContentChatsElementsItemTypeAdapter extends TypeAdapter<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TypeAdapter<a> f89043a;

        public OkRespDataSuccessContentChatsElementsItemTypeAdapter(@k TypeAdapter<a> typeAdapter) {
            this.f89043a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final a read(com.google.gson.stream.a aVar) {
            a aVar2 = this.f89043a.read(aVar);
            return aVar2 == null ? a.c.f89045a : aVar2;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(c cVar, a aVar) {
            this.f89043a.write(cVar, aVar);
        }
    }

    @Override // com.google.gson.r
    @l
    public final <T> TypeAdapter<T> a(@k Gson gson, @k com.google.gson.reflect.a<T> aVar) {
        if (L.f(aVar.getRawType(), a.class)) {
            return new OkRespDataSuccessContentChatsElementsItemTypeAdapter(gson.h(this, com.google.gson.reflect.a.get(a.class)));
        }
        return null;
    }
}
