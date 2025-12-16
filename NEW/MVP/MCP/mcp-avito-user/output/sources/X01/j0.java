package x01;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class j0 {
    public static HashMap a(Context context, String str) throws Throwable {
        HashSet hashSet;
        if (context == null) {
            return null;
        }
        Map<String, ?> all = context.getSharedPreferences(C49733s.f(context, str), 0).getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        C49714A.a().getClass();
        Set<String> setKeySet = C49714A.f441937b.keySet();
        if (setKeySet == null || setKeySet.size() == 0) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet();
            for (String str2 : setKeySet) {
                if ("_default_config_tag".equals(str2)) {
                    hashSet.add("_default_config_tag");
                } else {
                    String strQ = androidx.appcompat.app.r.q(str2, "-oper");
                    String strQ2 = androidx.appcompat.app.r.q(str2, "-maint");
                    hashSet.add(strQ);
                    hashSet.add(strQ2);
                    hashSet.add(str2 + "-diffprivacy");
                }
            }
        }
        while (it.hasNext()) {
            if (!hashSet.contains(it.next().getKey())) {
                it.remove();
            }
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                c(key, (String) entry.getValue(), map);
            }
        }
        return map;
    }

    public static HashMap b(Context context, String str, String str2) throws Throwable {
        HashMap mapA;
        HashMap mapA2;
        if ("alltype".equals(str2) || TextUtils.isEmpty(str)) {
            m0.b("read all event records");
            mapA = a(context, "stat_v2_1");
            mapA2 = a(context, "cached_v2_1");
        } else {
            String strA = e0.a(str, str2);
            String strB = C49733s.b(context, "stat_v2_1", strA);
            mapA = new HashMap();
            c(strA, strB, mapA);
            String strB2 = C49733s.b(context, "cached_v2_1", strA);
            mapA2 = new HashMap();
            c(strA, strB2, mapA2);
        }
        if (mapA.size() == 0 && mapA2.size() == 0) {
            return new HashMap();
        }
        if (mapA.size() == 0) {
            return mapA2;
        }
        if (mapA2.size() == 0) {
            return mapA;
        }
        HashMap map = new HashMap(mapA);
        map.putAll(mapA2);
        return map;
    }

    public static void c(String str, String str2, HashMap map) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                X x12 = new X();
                try {
                    x12.b(jSONArray.getJSONObject(i12));
                    arrayList.add(x12);
                } catch (JSONException unused) {
                    m0.d("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            map.put(str, arrayList);
        } catch (JSONException unused2) {
            m0.d("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }
}
