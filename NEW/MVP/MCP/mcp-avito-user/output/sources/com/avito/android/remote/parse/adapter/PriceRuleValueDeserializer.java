package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.GlobalProperties;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: PriceRuleValueDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/PriceRuleValueDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/GlobalProperties$PriceRule$Value;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceRuleValueDeserializer implements com.google.gson.h<GlobalProperties.PriceRule.Value> {
    @Override // com.google.gson.h
    public final GlobalProperties.PriceRule.Value deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        String strS;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("postfix");
        String strS2 = null;
        String strS3 = iVarD != null ? iVarD.s() : null;
        com.google.gson.i iVarD2 = kVarI.D("title");
        iVarD2.getClass();
        if (iVarD2 instanceof com.google.gson.k) {
            strS = iVarD2.i().D("short").s();
            com.google.gson.i iVarD3 = iVarD2.i().D("full");
            if (iVarD3 != null) {
                strS2 = iVarD3.s();
            }
        } else {
            strS = ((iVarD2 instanceof com.google.gson.m) && (iVarD2.j().f362195b instanceof String)) ? iVarD2.s() : "";
        }
        return new GlobalProperties.PriceRule.Value(strS, strS2, strS3);
    }
}
