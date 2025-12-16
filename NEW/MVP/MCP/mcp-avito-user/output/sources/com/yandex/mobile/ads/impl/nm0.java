package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class nm0 {
    public static boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
