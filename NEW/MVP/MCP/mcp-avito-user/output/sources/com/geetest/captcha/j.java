package com.geetest.captcha;

import android.content.Context;
import android.util.Pair;
import com.geetest.captcha.k;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final j f342743a = new j();
    }

    public String a(Context context) throws JSONException, NoSuchAlgorithmException {
        String strA;
        long jCurrentTimeMillis;
        k kVar = k.a.f342745a;
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            return jSONObject.toString();
        }
        try {
            strA = context.getSharedPreferences("gt_fp", 0).getString("gt_fp", null);
        } catch (Exception unused) {
            strA = "$unknown";
        }
        try {
            jCurrentTimeMillis = context.getSharedPreferences("gt_fp", 0).getLong("gt_ts", 0L);
        } catch (Exception unused2) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                context.getSharedPreferences("gt_fp", 0).edit().putLong("gt_ts", jCurrentTimeMillis).apply();
            } catch (Exception unused3) {
            }
        }
        try {
            jSONObject.put("bd", "$unknown");
            Pair<String, String> pairA = l.a(context);
            if (pairA != null) {
                jSONObject.put("d", pairA.first);
                jSONObject.put("e", pairA.second);
                if (i.b(strA) && !i.b((String) pairA.first)) {
                    strA = i.a(context, (String) pairA.first);
                }
            } else {
                jSONObject.put("d", "$unknown");
                jSONObject.put("e", "$unknown");
            }
            if (i.b(strA)) {
                strA = i.a(context, UUID.randomUUID().toString());
            }
            jSONObject.put("fp", strA);
            jSONObject.put("ts", jCurrentTimeMillis + "");
            jSONObject.put("ver", "1.0.0");
            jSONObject.put("client_type", "android");
        } catch (JSONException unused4) {
        }
        return jSONObject.toString();
    }
}
