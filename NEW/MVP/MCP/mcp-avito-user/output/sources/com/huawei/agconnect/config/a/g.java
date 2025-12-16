package com.huawei.agconnect.config.a;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f363152a;

    public g(InputStream inputStream) {
        JSONObject jSONObject;
        if (inputStream != null) {
            try {
                jSONObject = new JSONObject(k.b(inputStream));
            } catch (IOException | JSONException unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.f363152a = jSONObject;
    }

    @Override // com.huawei.agconnect.config.a.e
    public final String a(String str) throws JSONException {
        if (str.endsWith("/")) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        try {
            JSONObject jSONObject = this.f363152a;
            for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                if (i12 == strArrSplit.length - 1) {
                    return jSONObject.get(strArrSplit[i12]).toString();
                }
                jSONObject = jSONObject.getJSONObject(strArrSplit[i12]);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public final String toString() {
        return "InputStreamReader{config=" + this.f363152a.toString().hashCode() + '}';
    }
}
