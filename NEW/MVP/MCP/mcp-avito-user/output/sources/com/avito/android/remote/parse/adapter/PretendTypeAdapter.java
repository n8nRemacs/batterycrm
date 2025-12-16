package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PretendTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/PretendTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/PretendResult;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PretendTypeAdapter implements com.google.gson.h<PretendResult> {
    @Override // com.google.gson.h
    public final PretendResult deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        Map map;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("success");
        boolean zD2 = iVarD != null ? iVarD.d() : false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.google.gson.i iVarD2 = kVarI.D("params");
        if (iVarD2 != null && (iVarD2 instanceof com.google.gson.k) && (map = (Map) gVar.b(iVarD2, M.f254192a.getType())) != null) {
            linkedHashMap.putAll(map);
        }
        com.google.gson.i iVarD3 = kVarI.D("slots");
        if (iVarD3 != null && (iVarD3 instanceof com.google.gson.k)) {
            Map map2 = (Map) gVar.b(iVarD3, M.f254193b.getType());
            Iterator it = map2.keySet().iterator();
            while (it.hasNext()) {
                Map map3 = (Map) map2.get((String) it.next());
                if (map3 != null) {
                    linkedHashMap.putAll(map3);
                }
            }
        }
        kVarI.K("success");
        kVarI.K("params");
        kVarI.K("slots");
        for (Map.Entry<String, com.google.gson.i> entry : kVarI.f362194b.entrySet()) {
            com.google.gson.i value = entry.getValue();
            if (value instanceof com.google.gson.m) {
                linkedHashMap.put(entry.getKey(), new PretendErrorValue.Message(((com.google.gson.m) value).s()));
            }
        }
        return new PretendResult(zD2, linkedHashMap);
    }
}
