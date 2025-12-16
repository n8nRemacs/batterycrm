package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.yandex.metrica.impl.ob.Tl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Ii {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f378507a;

    static {
        HashSet hashSet = new HashSet();
        f378507a = hashSet;
        C31685o.r(hashSet, "get_ad", "report", "report_ad", "location");
        hashSet.add("startup");
        hashSet.add("diagnostic");
        hashSet.add("mediascope");
    }

    public void a(@j.N Ui ui2, @j.N Tl.a aVar) {
        String string;
        List<String> listA;
        String string2 = "";
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("query_hosts");
            } catch (Throwable unused) {
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (jSONObjectOptJSONObject != null) {
                try {
                    string = jSONObjectOptJSONObject.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused2) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    ui2.f(string);
                }
                List<String> listA2 = a(jSONObjectOptJSONObject, "report");
                if (!A2.b(listA2)) {
                    ui2.f(listA2);
                }
                try {
                    string2 = jSONObjectOptJSONObject.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused3) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    ui2.g(string2);
                }
                List<String> listA3 = a(jSONObjectOptJSONObject, "location");
                if (!A2.b(listA3)) {
                    ui2.c(listA3);
                }
                List<String> listA4 = a(jSONObjectOptJSONObject, "startup");
                if (!A2.b(listA4)) {
                    ui2.h(listA4);
                }
                List<String> listA5 = a(jSONObjectOptJSONObject, "diagnostic");
                if (!A2.b(listA5)) {
                    ui2.a(listA5);
                }
                List<String> listA6 = a(jSONObjectOptJSONObject, "mediascope");
                if (!A2.b(listA6)) {
                    ui2.e(listA6);
                }
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!f378507a.contains(next) && (listA = a(jSONObjectOptJSONObject, next)) != null) {
                        map.put(next, listA);
                    }
                }
                ui2.a(map);
            }
        } catch (Throwable unused4) {
        }
    }

    private List<String> a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return Tl.b(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
