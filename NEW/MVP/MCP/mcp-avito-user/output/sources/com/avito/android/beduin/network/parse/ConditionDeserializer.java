package com.avito.android.beduin.network.parse;

import com.avito.android.beduin.network.model.Condition;
import com.avito.android.remote.C34328m0;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: ConditionDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/ConditionDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/network/model/Condition;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConditionDeserializer implements h<Condition> {
    @Override // com.google.gson.h
    public final Condition deserialize(i iVar, Type type, g gVar) {
        if (!(iVar instanceof k)) {
            return null;
        }
        k kVar = (k) iVar;
        i iVarD = kVar.D("equals");
        Integer numB = iVarD != null ? C34328m0.b(iVarD) : null;
        if (numB != null) {
            return new Condition.Equals(numB.intValue());
        }
        i iVarD2 = kVar.D("start");
        Integer numB2 = iVarD2 != null ? C34328m0.b(iVarD2) : null;
        i iVarD3 = kVar.D("end");
        return new Condition.Range(numB2, iVarD3 != null ? C34328m0.b(iVarD3) : null);
    }
}
