package com.yandex.metrica.impl.ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class E7 {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f378038a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    @j.P
    public C38869i4 a(@j.N String str) {
        try {
            return a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }

    @j.P
    private C38869i4 a(@j.N JSONObject jSONObject) throws JSONException, NumberFormatException {
        try {
            for (String str : f378038a) {
                if (!jSONObject.has(str)) {
                    return null;
                }
            }
            int i12 = jSONObject.getInt("arg_pd");
            if (i12 == 0) {
                i12 = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C38869i4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i12), jSONObject.getString("arg_ps"), CounterConfiguration.b.a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }
}
