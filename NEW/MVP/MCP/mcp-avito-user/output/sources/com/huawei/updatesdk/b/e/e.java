package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class e {
    private static String a(Context context, String str) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        byte[] bArr = new byte[inputStreamOpen.available()];
        com.huawei.updatesdk.a.a.a.b("JsonPareUrl", "loadJSONFromAsset code: " + inputStreamOpen.read(bArr));
        inputStreamOpen.close();
        return new String(bArr, Constants.ENCODING);
    }

    public static String b(Context context, String str) throws JSONException {
        String string = "";
        try {
            JSONArray jSONArray = new JSONObject(a(context, str)).getJSONArray("services");
            JSONArray jSONArray2 = jSONArray.getJSONObject(0).getJSONArray("servings");
            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i12);
                if (TextUtils.equals("DR3", jSONObject.getString("countryOrAreaGroup"))) {
                    string = jSONObject.getJSONObject("addresses").getString("ROOT");
                }
            }
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.a.a("JsonPareUrl", "Failed to obtain the default url.");
        }
        return string;
    }
}
