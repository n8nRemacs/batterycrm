package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.Condition;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ConditionTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ConditionTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/Condition;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConditionTypeAdapter implements com.google.gson.h<Condition> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, Type> f254167a = Collections.singletonMap("selectParameterValue", Condition.SelectParameterValue.class);

    @Override // com.google.gson.h
    public final Condition deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.i iVarD = iVar.i().D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Type type2 = this.f254167a.get(strS);
        if (type2 == null) {
            return null;
        }
        return (Condition) gVar.b(iVar, type2);
    }
}
