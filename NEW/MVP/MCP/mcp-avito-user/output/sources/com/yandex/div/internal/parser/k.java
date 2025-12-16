package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.json.JSONArray;

/* compiled from: JsonParser.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/div/json/b;", "T", "Lorg/json/JSONArray;", "jsonArray", "", "i", "invoke", "(Lorg/json/JSONArray;I)Lcom/yandex/div/json/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class k extends N implements Y41.p<JSONArray, Integer, com.yandex.div.json.b> {
    @Override // Y41.p
    public final com.yandex.div.json.b invoke(JSONArray jSONArray, Integer num) {
        if (jSONArray.optJSONObject(num.intValue()) == null) {
            return null;
        }
        throw null;
    }
}
