package com.yandex.div.internal.util;

import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div-json_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j {
    public static String a(JSONArray jSONArray) {
        return i.a(jSONArray, 1).toString();
    }

    public static String b(JSONObject jSONObject) {
        return i.b(jSONObject, 1).toString();
    }
}
