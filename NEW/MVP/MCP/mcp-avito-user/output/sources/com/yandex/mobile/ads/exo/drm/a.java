package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.ka0;
import com.yandex.mobile.ads.impl.pc1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        if (pc1.f388768a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(pc1.a(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                if (i12 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                sb2.append("{\"k\":\"");
                sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                sb2.append("\",\"kid\":\"");
                sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return pc1.b(sb2.toString());
        } catch (JSONException e12) {
            StringBuilder sbA = Cif.a("Failed to adjust response data: ");
            sbA.append(pc1.a(bArr));
            ka0.a("ClearKeyUtil", sbA.toString(), e12);
            return bArr;
        }
    }
}
