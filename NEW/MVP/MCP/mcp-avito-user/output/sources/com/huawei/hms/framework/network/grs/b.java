package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q01.C47180a;
import q01.C47181b;
import s01.C47954c;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final GrsBaseInfo f363486a;

    /* renamed from: b, reason: collision with root package name */
    public final C47180a f363487b;

    /* renamed from: c, reason: collision with root package name */
    public final j f363488c;

    /* renamed from: d, reason: collision with root package name */
    public final q01.c f363489d;

    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public String f363490a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f363491b;

        /* renamed from: c, reason: collision with root package name */
        public IQueryUrlsCallBack f363492c;

        /* renamed from: d, reason: collision with root package name */
        public Context f363493d;

        /* renamed from: e, reason: collision with root package name */
        public GrsBaseInfo f363494e;

        /* renamed from: f, reason: collision with root package name */
        public C47180a f363495f;

        public a() {
            throw null;
        }

        @Override // com.huawei.hms.framework.network.grs.c
        public final void a() {
            IQueryUrlsCallBack iQueryUrlsCallBack = this.f363492c;
            Map<String, String> mapC = this.f363491b;
            if (mapC != null && !mapC.isEmpty()) {
                Logger.i("a", "get expired cache localUrls");
            } else {
                if (mapC != null) {
                    iQueryUrlsCallBack.onCallBackFail(-3);
                    return;
                }
                Logger.i("a", "access local config for return a domain.");
                mapC = com.huawei.hms.framework.network.grs.f.b.a(this.f363493d.getPackageName(), this.f363494e).c(this.f363493d, this.f363495f, this.f363494e, this.f363490a, true);
            }
            iQueryUrlsCallBack.onCallBackSuccess(mapC);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hms.framework.network.grs.c
        public final void a(com.huawei.hms.framework.network.grs.g.e eVar) {
            String str;
            Map mapC;
            Map map;
            HashMap mapC2 = b.c(eVar.f363564g, this.f363490a);
            boolean zIsEmpty = mapC2.isEmpty();
            IQueryUrlsCallBack iQueryUrlsCallBack = this.f363492c;
            if (zIsEmpty) {
                Map map2 = this.f363491b;
                if (map2 == null || map2.isEmpty()) {
                    if (map2 != null) {
                        iQueryUrlsCallBack.onCallBackFail(-5);
                        return;
                    }
                    Logger.i("a", "access local config for return a domain.");
                    mapC = com.huawei.hms.framework.network.grs.f.b.a(this.f363493d.getPackageName(), this.f363494e).c(this.f363493d, this.f363495f, this.f363494e, this.f363490a, true);
                    iQueryUrlsCallBack.onCallBackSuccess(mapC);
                }
                str = "get expired cache localUrls";
                map = map2;
            } else {
                str = "get url is from remote server";
                map = mapC2;
            }
            Logger.i("a", str);
            mapC = map;
            iQueryUrlsCallBack.onCallBackSuccess(mapC);
        }
    }

    /* renamed from: com.huawei.hms.framework.network.grs.b$b, reason: collision with other inner class name */
    public static class C10755b implements c {

        /* renamed from: a, reason: collision with root package name */
        public String f363496a;

        /* renamed from: b, reason: collision with root package name */
        public String f363497b;

        /* renamed from: c, reason: collision with root package name */
        public IQueryUrlCallBack f363498c;

        /* renamed from: d, reason: collision with root package name */
        public String f363499d;

        /* renamed from: e, reason: collision with root package name */
        public Context f363500e;

        /* renamed from: f, reason: collision with root package name */
        public GrsBaseInfo f363501f;

        /* renamed from: g, reason: collision with root package name */
        public C47180a f363502g;

        @Override // com.huawei.hms.framework.network.grs.c
        public final void a() {
            String strB = this.f363499d;
            boolean zIsEmpty = TextUtils.isEmpty(strB);
            IQueryUrlCallBack iQueryUrlCallBack = this.f363498c;
            if (!zIsEmpty) {
                Logger.i("a", "get expired cache localUrl");
            } else {
                if (!TextUtils.isEmpty(strB)) {
                    iQueryUrlCallBack.onCallBackFail(-3);
                    return;
                }
                Logger.i("a", "access local config for return a domain.");
                strB = com.huawei.hms.framework.network.grs.f.b.a(this.f363500e.getPackageName(), this.f363501f).b(this.f363500e, this.f363502g, this.f363501f, this.f363496a, this.f363497b);
            }
            iQueryUrlCallBack.onCallBackSuccess(strB);
        }

        @Override // com.huawei.hms.framework.network.grs.c
        public final void a(com.huawei.hms.framework.network.grs.g.e eVar) {
            String strB;
            HashMap mapC = b.c(eVar.f363564g, this.f363496a);
            String str = this.f363497b;
            boolean zContainsKey = mapC.containsKey(str);
            IQueryUrlCallBack iQueryUrlCallBack = this.f363498c;
            if (zContainsKey) {
                Logger.i("a", "get url is from remote server");
                strB = (String) mapC.get(str);
            } else {
                strB = this.f363499d;
                if (!TextUtils.isEmpty(strB)) {
                    Logger.i("a", "get expired cache localUrl");
                } else {
                    if (!TextUtils.isEmpty(strB)) {
                        iQueryUrlCallBack.onCallBackFail(-5);
                        return;
                    }
                    Logger.i("a", "access local config for return a domain.");
                    strB = com.huawei.hms.framework.network.grs.f.b.a(this.f363500e.getPackageName(), this.f363501f).b(this.f363500e, this.f363502g, this.f363501f, this.f363496a, this.f363497b);
                }
            }
            iQueryUrlCallBack.onCallBackSuccess(strB);
        }
    }

    public b(GrsBaseInfo grsBaseInfo, C47180a c47180a, j jVar, q01.c cVar) {
        this.f363486a = grsBaseInfo;
        this.f363487b = c47180a;
        this.f363488c = jVar;
        this.f363489d = cVar;
    }

    public static HashMap b(String str) {
        HashMap map = new HashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v("a", "isSpExpire jsonValue is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, d(jSONObject.getJSONObject(next)));
            }
            return map;
        } catch (JSONException e12) {
            Logger.w("a", "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return map;
        }
    }

    public static HashMap c(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w("a", "isSpExpire jsonValue from server is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w("a", "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return map;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next).toString());
            }
            return map;
        } catch (JSONException e12) {
            Logger.w("a", "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return map;
        }
    }

    public static HashMap d(JSONObject jSONObject) {
        HashMap map = new HashMap(16);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next).toString());
            }
            return map;
        } catch (JSONException e12) {
            Logger.w("a", "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return map;
        }
    }

    public final String a(Context context, String str) {
        GrsBaseInfo grsBaseInfo = this.f363486a;
        com.huawei.hms.framework.network.grs.g.e eVarA = this.f363488c.a(new C47954c(context, grsBaseInfo), str, this.f363489d);
        return eVarA == null ? "" : eVarA.b() ? this.f363487b.f428946c.a(grsBaseInfo.getGrsParasKey(true, true, context), "") : eVarA.f363564g;
    }

    public final Map<String, String> e(String str, C47181b c47181b, Context context) {
        Map<String, String> map;
        C47180a c47180a = this.f363487b;
        c47180a.getClass();
        GrsBaseInfo grsBaseInfo = this.f363486a;
        Map map2 = (Map) c47180a.f428944a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (map2 == null || map2.isEmpty()) {
            map = new HashMap<>();
        } else {
            Long l12 = (Long) c47180a.f428945b.get(grsBaseInfo.getGrsParasKey(true, true, context));
            if (t01.e.a(l12)) {
                c47181b.f428949a = 2;
            } else {
                if (t01.e.b(l12)) {
                    c47180a.f428948e.c(new C47954c(context, grsBaseInfo), null, str, c47180a.f428947d);
                }
                c47181b.f428949a = 1;
            }
            map = (Map) map2.get(str);
        }
        if (map == null || map.isEmpty()) {
            Map<String, String> mapC = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName(), grsBaseInfo).c(context, this.f363487b, this.f363486a, str, false);
            return mapC != null ? mapC : new HashMap();
        }
        com.huawei.hms.framework.network.grs.f.b.e(context, grsBaseInfo);
        return map;
    }
}
