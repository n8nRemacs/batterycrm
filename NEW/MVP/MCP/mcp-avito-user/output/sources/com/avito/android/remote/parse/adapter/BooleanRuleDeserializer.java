package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.SearchProperties;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BooleanRuleDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/BooleanRuleDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/SearchProperties$BooleanRule;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BooleanRuleDeserializer implements com.google.gson.h<SearchProperties.BooleanRule> {
    @Override // com.google.gson.h
    public final SearchProperties.BooleanRule deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if ((iVar instanceof com.google.gson.m) && (iVar.j().f362195b instanceof Boolean)) {
            return new SearchProperties.BooleanRule(Collections.singletonList(new SearchProperties.BooleanRule.Value(null, null, iVar.d())));
        }
        if (!(iVar instanceof com.google.gson.f)) {
            return new SearchProperties.BooleanRule(C42784z0.f406748b);
        }
        com.google.gson.f fVarH = iVar.h();
        ArrayList arrayList = new ArrayList(C42745f0.q(fVarH, 10));
        Iterator it = fVarH.f362000b.iterator();
        while (it.hasNext()) {
            arrayList.add((SearchProperties.BooleanRule.Value) gVar.b((com.google.gson.i) it.next(), SearchProperties.BooleanRule.Value.class));
        }
        return new SearchProperties.BooleanRule(arrayList);
    }
}
