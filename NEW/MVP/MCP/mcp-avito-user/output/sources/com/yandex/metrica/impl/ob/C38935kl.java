package com.yandex.metrica.impl.ob;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38935kl implements Kk {
    @Override // com.yandex.metrica.impl.ob.Kk
    @j.N
    public JSONObject a(@j.N Activity activity, long j12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sid", activity.getClass().getName()).put("cid", j12);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
