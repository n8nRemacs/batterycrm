package com.yandex.mobile.ads.impl;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class m80 {
    @j.P
    public static HashMap a(@j.N JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bidding_info");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObjectOptJSONObject.optString(next);
            if (!TextUtils.isEmpty(strOptString) && !"null".equals(strOptString)) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static String b(@j.N String str, @j.N JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        return String.valueOf(Html.fromHtml(string));
    }

    @j.P
    public static ArrayList c(@j.N String str, @j.N JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
            String strOptString = jSONArrayOptJSONArray.optString(i12);
            if (!TextUtils.isEmpty(strOptString) && !"null".equals(strOptString)) {
                arrayList.add(jSONArrayOptJSONArray.optString(i12));
            }
        }
        return arrayList;
    }

    @j.N
    public static String a(@j.N String str, @j.N JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            throw new JSONException("Json has not required attributes");
        }
        return string;
    }
}
