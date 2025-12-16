package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.PretendErrorValue;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectsResultDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ObjectsResultDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/PretendErrorValue$ObjectsMessages;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ObjectsResultDeserializer implements com.google.gson.h<PretendErrorValue.ObjectsMessages> {
    @Override // com.google.gson.h
    public final PretendErrorValue.ObjectsMessages deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.k kVarI2 = kVarI.D("value").i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = kVarI2.f362194b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) entry.getKey())), gVar.b((com.google.gson.i) entry.getValue(), I.f254186a.getType()));
        }
        com.google.gson.i iVarD = kVarI.D("message");
        return new PretendErrorValue.ObjectsMessages(linkedHashMap, iVarD != null ? C34328m0.e(iVarD) : null);
    }
}
