package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.SuccessResult;
import com.avito.android.util.InvalidSchemaException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: SuccessResultDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SuccessResultDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/SuccessResult;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SuccessResultDeserializer implements com.google.gson.h<SuccessResult> {
    @Override // com.google.gson.h
    public final SuccessResult deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("success");
        if (!(iVarD != null ? iVarD.d() : false)) {
            throw new InvalidSchemaException(m0.f406844a.b(SuccessResult.class), "success", "expected \"success\" value to be true");
        }
        com.google.gson.i iVarD2 = kVarI.D("message");
        return new SuccessResult(iVarD2 != null ? iVarD2.s() : null);
    }
}
