package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39010nl implements Kk {
    @Override // com.yandex.metrica.impl.ob.Kk
    @j.N
    public JSONObject a(@j.N Activity activity, long j12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put("cid", j12)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
