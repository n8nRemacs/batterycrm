package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.ParametrizedEvent;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ParametrizedEventTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ParametrizedEventTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParametrizedEventTypeAdapter implements com.google.gson.h<ParametrizedEvent> {
    @Override // com.google.gson.h
    public final ParametrizedEvent deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        int iG2 = kVarI.D("id").g();
        int iG3 = kVarI.D("version").g();
        com.google.gson.i iVarD = kVarI.D(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS);
        LinkedHashMap linkedHashMap = null;
        Map map = (Map) (iVarD == null ? null : gVar.b(iVarD, Map.class));
        if (map != null) {
            linkedHashMap = new LinkedHashMap(P0.f(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Double) {
                    Number number = (Number) value;
                    long jDoubleValue = (long) number.doubleValue();
                    if (number.doubleValue() == jDoubleValue) {
                        value = Long.valueOf(jDoubleValue);
                    }
                }
                linkedHashMap.put(key, value);
            }
        }
        return new ParametrizedEvent(iG2, iG3, linkedHashMap);
    }
}
