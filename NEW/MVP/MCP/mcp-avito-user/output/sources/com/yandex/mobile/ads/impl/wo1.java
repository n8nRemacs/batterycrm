package com.yandex.mobile.ads.impl;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class wo1 {
    public static JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        gp1.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        gp1.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        gp1.a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
