package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

/* compiled from: JsonParser.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div-json_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class r {
    public static Object a(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt("type");
        if (L.f(objOpt, JSONObject.NULL)) {
            objOpt = null;
        }
        if (objOpt != null) {
            return objOpt;
        }
        throw com.yandex.div.json.j.g("type", jSONObject);
    }
}
