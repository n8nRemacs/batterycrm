package com.huawei.hms.framework.network.grs.f;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w01.C49418a;
import w01.C49419b;

/* loaded from: classes7.dex */
public class c extends a {
    public static ArrayList i(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C49419b c49419b = new C49419b();
                c49419b.f441144a = next;
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                jSONObject2.getString("name");
                jSONObject2.getString("description");
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        hashSet.add((String) jSONArray.get(i12));
                    }
                    c49419b.f441145b = hashSet;
                    arrayList.add(c49419b);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e12) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return new ArrayList();
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public final int b(String str) throws JSONException {
        this.f363518a = new C49418a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f363518a.f441142a = string;
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e12) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public final int e(String str) throws JSONException {
        JSONObject jSONObject;
        this.f363519b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() == 0) {
                return 0;
            }
            this.f363519b.addAll(i(jSONObject));
            return 0;
        } catch (JSONException e12) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff A[Catch: JSONException -> 0x006c, TryCatch #0 {JSONException -> 0x006c, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0024, B:8:0x0031, B:10:0x0037, B:12:0x003e, B:13:0x0050, B:15:0x0056, B:17:0x0067, B:25:0x0081, B:26:0x0096, B:28:0x009c, B:29:0x00b4, B:20:0x006f, B:22:0x0075, B:23:0x007a, B:30:0x00c6, B:32:0x00d0, B:37:0x00e1, B:40:0x00e8, B:43:0x00f9, B:45:0x00ff, B:46:0x0106, B:41:0x00ed, B:33:0x00d5, B:35:0x00db, B:42:0x00f3), top: B:51:0x000c }] */
    @Override // com.huawei.hms.framework.network.grs.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.lang.String r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.c.h(java.lang.String):int");
    }
}
