package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.json.JSONArray;

/* compiled from: JsonParser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "T", "", "jsonArray", "Lorg/json/JSONArray;", "i", "", "invoke", "(Lorg/json/JSONArray;I)Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class l extends N implements Y41.p<JSONArray, Integer, Object> {
    @Override // Y41.p
    public final Object invoke(JSONArray jSONArray, Integer num) {
        JSONArray jSONArray2 = jSONArray;
        int iIntValue = num.intValue();
        if (C38108d.a(jSONArray2, iIntValue) != null) {
            throw null;
        }
        throw com.yandex.div.json.j.h(jSONArray2, null, iIntValue);
    }
}
