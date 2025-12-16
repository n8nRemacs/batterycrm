package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class od {
    @Y61.k
    public static nd a(@Y61.k JSONObject jSONObject) {
        Object objOpt = jSONObject.opt("top");
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jSONObject.opt("right");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jSONObject.opt("left");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jSONObject.opt("bottom");
        return new nd(str, str2, str3, objOpt4 instanceof String ? (String) objOpt4 : null);
    }
}
