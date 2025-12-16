package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Error;
import com.avito.android.remote.model.ErrorContainer;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorContainerDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ErrorContainerDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ErrorContainer;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorContainerDeserializer implements com.google.gson.h<ErrorContainer> {
    @Override // com.google.gson.h
    public final ErrorContainer deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (!(iVar instanceof com.google.gson.k)) {
            Error error = new Error();
            error.setSimpleMessage("");
            return new ErrorContainer(error);
        }
        com.google.gson.i iVarD = iVar.i().D("error");
        com.google.gson.k kVarI = iVarD != null ? iVarD.i() : null;
        if (kVarI != null) {
            return new ErrorContainer((Error) gVar.b(kVarI, Error.class));
        }
        Error error2 = new Error();
        error2.setSimpleMessage("");
        return new ErrorContainer(error2);
    }
}
