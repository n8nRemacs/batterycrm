package com.avito.android.remote.parse.adapter;

import androidx.collection.C20199a;
import com.avito.android.remote.model.Error;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ErrorDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ErrorDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/Error;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorDeserializer implements com.google.gson.h<Error> {
    public static C20199a a(com.google.gson.k kVar) {
        C20199a c20199a = new C20199a();
        for (Map.Entry<String, com.google.gson.i> entry : kVar.f362194b.entrySet()) {
            c20199a.put(entry.getKey(), entry.getValue().s());
        }
        return c20199a;
    }

    @Override // com.google.gson.h
    public final Error deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        String strS;
        Error error = new Error();
        com.google.gson.k kVarI = iVar.i();
        error.setCode(kVarI.D("code").g());
        com.google.gson.i iVarD = kVarI.D("messages");
        com.google.gson.k kVarI2 = iVarD != null ? iVarD.i() : null;
        if (kVarI2 == null) {
            com.google.gson.i iVarD2 = kVarI.D("message");
            if (iVarD2 == null || (strS = iVarD2.s()) == null) {
                strS = "";
            }
            error.setSimpleMessage(strS);
        } else {
            com.google.gson.i iVarD3 = kVarI2.D("params");
            com.google.gson.k kVarI3 = iVarD3 != null ? iVarD3.i() : null;
            if (kVarI3 == null) {
                error.setParamsMessages(a(kVarI2));
            } else {
                error.setParamsMessages(a(kVarI3));
            }
        }
        return error;
    }
}
