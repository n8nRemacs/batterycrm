package com.avito.android.remote.parse.adapter;

import androidx.collection.C20199a;
import com.avito.android.remote.model.References;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReferencesTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ReferencesTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/References;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReferencesTypeAdapter implements com.google.gson.h<References> {
    public static C20199a a(com.google.gson.k kVar, String str) {
        if (!kVar.f362194b.containsKey(str) || kVar.I(str).f362194b.entrySet().isEmpty()) {
            return null;
        }
        com.google.gson.k kVarI = kVar.I(str);
        C20199a c20199a = new C20199a();
        for (Map.Entry<String, com.google.gson.i> entry : kVarI.f362194b.entrySet()) {
            c20199a.put(entry.getKey(), entry.getValue().i().D("name").s());
        }
        return c20199a;
    }

    @Override // com.google.gson.h
    public final References deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        return new References(a(kVarI, "locations"), a(kVarI, MetroParameter.TYPE), a(kVarI, "districts"), a(kVarI, "directions"), a(kVarI, "categories"));
    }
}
