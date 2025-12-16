package com.huawei.hms.framework.network.grs.f;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w01.C49418a;
import w01.C49419b;

/* loaded from: classes7.dex */
public class d extends a {
    @Override // com.huawei.hms.framework.network.grs.f.a
    public final int b(String str) throws JSONException {
        this.f363518a = new C49418a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray("applications").getJSONObject(0);
            this.f363518a.f441142a = jSONObject.getString("name");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            if (jSONArray != null && jSONArray.length() != 0) {
                if (jSONObject.has("customservices")) {
                    f(jSONObject.getJSONArray("customservices"));
                }
                return 0;
            }
            return -1;
        } catch (JSONException e12) {
            Logger.w("LocalManagerV2", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public final int e(String str) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        this.f363519b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("LocalManagerV2", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            if (jSONArray.length() != 0) {
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                    C49419b c49419b = new C49419b();
                    c49419b.f441144a = jSONObject2.getString("id");
                    jSONObject2.getString("name");
                    jSONObject2.getString("description");
                    if (jSONObject2.has("countriesOrAreas")) {
                        jSONArray2 = jSONObject2.getJSONArray("countriesOrAreas");
                    } else if (jSONObject2.has("countries")) {
                        jSONArray2 = jSONObject2.getJSONArray("countries");
                    } else {
                        Logger.w("LocalManagerV2", "current country or area group has not config countries or areas.");
                        jSONArray2 = null;
                    }
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null && jSONArray2.length() != 0) {
                        for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                            hashSet.add((String) jSONArray2.get(i13));
                        }
                        c49419b.f441145b = hashSet;
                        this.f363519b.add(c49419b);
                    }
                    return -1;
                }
            }
            return 0;
        } catch (JSONException e12) {
            Logger.w("LocalManagerV2", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public final int h(String str) {
        return g(str);
    }
}
