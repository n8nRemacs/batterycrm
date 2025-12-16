package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.util.C2;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: NameIdEntityTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/NameIdEntityTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/NameIdEntity;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NameIdEntityTypeAdapter implements com.google.gson.h<NameIdEntity> {
    @Override // com.google.gson.h
    public final NameIdEntity deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        String strC = C2.c(kVarI, "id");
        if (strC == null) {
            return null;
        }
        return new NameIdEntity(strC, C2.c(kVarI, "name"));
    }
}
