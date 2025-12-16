package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: DateParameterValueTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/DateParameterValueTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DateParameterValueTypeAdapter implements com.google.gson.h<DateTimeParameter.Value> {
    @Override // com.google.gson.h
    public final DateTimeParameter.Value deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        long jLongValue;
        com.google.gson.i iVarD;
        if (iVar instanceof com.google.gson.m) {
            jLongValue = iVar.l();
        } else {
            Long lValueOf = (!(iVar instanceof com.google.gson.k) || (iVarD = iVar.i().D(IntParameter.TYPE)) == null) ? null : Long.valueOf(iVarD.l());
            if (lValueOf == null) {
                return null;
            }
            jLongValue = lValueOf.longValue();
        }
        return jLongValue == -1 ? DateTimeParameter.Value.PresentTime.INSTANCE : new DateTimeParameter.Value.Timestamp(TimeUnit.SECONDS.toMillis(jLongValue));
    }
}
