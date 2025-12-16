package com.yandex.mobile.ads.impl;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class kj1 {
    @Y61.k
    public static JSONObject a(@Y61.k jj1 jj1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", jj1Var.d().b());
        jSONObject2.put("height", jj1Var.d().a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", jj1Var.b().b());
        jSONObject3.put("height", jj1Var.b().a());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", jj1Var.c().b().b());
        String strName = jj1Var.c().b().a().name();
        Locale locale = Locale.ROOT;
        jSONObject4.put("mode", strName.toLowerCase(locale));
        jSONObject5.put("value", jj1Var.c().a().b());
        jSONObject5.put("mode", jj1Var.c().a().a().name().toLowerCase(locale));
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(jj1Var.a());
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        return jSONObject;
    }
}
