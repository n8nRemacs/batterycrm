package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class bc1 {
    @j.N
    public static String a(@j.N String str, @j.N JSONObject jSONObject) throws JSONException, yk0 {
        String strA = mm0.a(str, jSONObject);
        if (TextUtils.isEmpty(strA)) {
            throw new yk0("Native Ad json has not required attributes");
        }
        return strA;
    }
}
