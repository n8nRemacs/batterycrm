package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.fk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38810fk implements Gk {
    @Override // com.yandex.metrica.impl.ob.Gk
    @j.N
    public JSONObject a(@j.N Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cxts", obj);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
