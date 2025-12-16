package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ww0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ke f391507a = new ke();

    @j.N
    public final vw0 a(@j.N String str) throws JSONException {
        this.f391507a.getClass();
        JSONObject jSONObject = new JSONObject(ke.a(str.getBytes()));
        HashMap map = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        return new vw0(string, map);
    }
}
