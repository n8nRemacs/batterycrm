package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.j;
import com.huawei.hms.framework.network.grs.g.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q01.C47180a;
import s01.C47954c;
import w01.C49418a;
import w01.C49419b;
import w01.C49420c;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public C49418a f363518a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f363519b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f363520c = new ConcurrentHashMap(16);

    /* renamed from: d, reason: collision with root package name */
    public boolean f363521d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f363522e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f363523f = false;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f363524g = new HashSet(16);

    public static ArrayList c(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i12);
                C49419b c49419b = new C49419b();
                c49419b.f441144a = jSONObject.getString("id");
                jSONObject.getString("name");
                jSONObject.getString("description");
                if (jSONObject.has("countriesOrAreas")) {
                    jSONArray2 = jSONObject.getJSONArray("countriesOrAreas");
                } else if (jSONObject.has("countries")) {
                    jSONArray2 = jSONObject.getJSONArray("countries");
                } else {
                    Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray2 != null && jSONArray2.length() != 0) {
                    for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                        hashSet.add((String) jSONArray2.get(i13));
                    }
                    c49419b.f441145b = hashSet;
                    arrayList.add(c49419b);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e12) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return new ArrayList();
        }
    }

    public final int a(Context context, String str) throws IOException {
        int iB2;
        String str2 = GrsApp.getInstance().getBrand("/") + str;
        String strA = t01.c.a(context, str2);
        if (TextUtils.isEmpty(strA)) {
            iB2 = -1;
        } else if ((!this.f363522e || (iB2 = e(strA)) == 0) && (iB2 = b(strA)) == 0) {
            iB2 = h(strA);
        }
        if (iB2 != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str2);
        return 0;
    }

    public abstract int b(String str);

    public final Map<String, String> d(Context context, C47180a c47180a, GrsBaseInfo grsBaseInfo, String str, boolean z12) throws NumberFormatException {
        String str2;
        String[] strArr;
        String strA;
        Object obj;
        C49418a c49418a = this.f363518a;
        if (c49418a == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        C49420c c49420c = (C49420c) c49418a.f441143b.get(str);
        if (c49420c == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String str3 = c49420c.f441146a;
        Set<String> set = e.f363528a;
        if (TextUtils.isEmpty(str3)) {
            Logger.w("e", "routeBy must be not empty string or null.");
            str2 = null;
        } else if ("no_route".equals(str3) || "unconditional".equals(str3)) {
            Logger.v("e", "routeBy equals NO_ROUTE_POLICY");
            str2 = "no_route_country";
        } else {
            String serCountry = grsBaseInfo.getSerCountry();
            String regCountry = grsBaseInfo.getRegCountry();
            String issueCountry = grsBaseInfo.getIssueCountry();
            String[] strArrSplit = str3.split(">");
            int length = strArrSplit.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    serCountry = "";
                    break;
                }
                String str4 = strArrSplit[i12];
                if (!e.f363528a.contains(str4.trim())) {
                    strArr = strArrSplit;
                } else {
                    if ("ser_country".equals(str4.trim()) && !TextUtils.isEmpty(serCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(serCountry)) {
                        Logger.i("e", "current route_by is serCountry and routerCountry is:" + serCountry);
                        break;
                    }
                    strArr = strArrSplit;
                    if ("reg_country".equals(str4.trim()) && !TextUtils.isEmpty(regCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(regCountry)) {
                        Logger.i("e", "current route_by is regCountry and routerCountry is:" + regCountry);
                        serCountry = regCountry;
                        break;
                    }
                    if ("issue_country".equals(str4.trim()) && !TextUtils.isEmpty(issueCountry) && !GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(issueCountry)) {
                        Logger.i("e", "current route_by is issueCountry and routerCountry is:" + issueCountry);
                        serCountry = issueCountry;
                        break;
                    }
                    if ("geo_ip".equals(str4.trim())) {
                        com.huawei.hms.framework.network.grs.g.b bVar = new com.huawei.hms.framework.network.grs.g.b(context, c47180a, grsBaseInfo);
                        String str5 = (String) com.huawei.hms.framework.network.grs.b.c(c47180a.f428946c.a("geoipCountryCode", ""), "geoip.countrycode").get("ROOT");
                        Logger.i("GeoipCountry", "geoIpCountry is: " + str5);
                        String strA2 = c47180a.f428946c.a("geoipCountryCodetime", "0");
                        long j12 = 0;
                        if (!TextUtils.isEmpty(strA2) && strA2.matches(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN)) {
                            try {
                                j12 = Long.parseLong(strA2);
                            } catch (NumberFormatException e12) {
                                Logger.w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e12);
                            }
                        }
                        if (TextUtils.isEmpty(str5) || t01.e.a(Long.valueOf(j12))) {
                            C47954c c47954c = new C47954c(bVar.f363539a, bVar.f363540b);
                            c47954c.f437281c.add("geoip.countrycode");
                            q01.c cVar = c47180a.f428947d;
                            if (cVar != null) {
                                try {
                                    strA = k.a(cVar.a("services", ""), c47954c.a());
                                } catch (JSONException e13) {
                                    Logger.w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e13.getMessage()));
                                    strA = null;
                                }
                                if (!TextUtils.isEmpty(strA)) {
                                    cVar.c("services", strA);
                                }
                            }
                            j jVar = c47180a.f428948e;
                            if (z12) {
                                com.huawei.hms.framework.network.grs.g.e eVarA = jVar.a(c47954c, "geoip.countrycode", cVar);
                                if (eVarA != null) {
                                    str5 = (String) com.huawei.hms.framework.network.grs.b.c(eVarA.f363564g, "geoip.countrycode").get("ROOT");
                                }
                                Logger.i("GeoipCountry", "sync request to query geoip.countrycode is:" + str5);
                            } else {
                                Logger.i("GeoipCountry", "async request to query geoip.countrycode");
                                jVar.c(c47954c, null, "geoip.countrycode", cVar);
                            }
                        }
                        serCountry = str5;
                        Logger.i("e", "current route_by is geo_ip and routerCountry is: " + serCountry);
                    }
                }
                i12++;
                strArrSplit = strArr;
            }
            str2 = serCountry;
        }
        if (str2 == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", c49420c.f441146a);
            return null;
        }
        ArrayList<C49419b> arrayList = c49420c.f441148c;
        HashMap map = c49420c.f441147b;
        if (arrayList == null || arrayList.size() == 0) {
            obj = this.f363520c.get(str2);
        } else {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
            concurrentHashMap.put("no_route_country", "no-country");
            for (C49419b c49419b : arrayList) {
                if (c49419b.f441145b.contains(grsBaseInfo.getIssueCountry())) {
                    concurrentHashMap.put(grsBaseInfo.getIssueCountry(), c49419b.f441144a);
                }
                if (c49419b.f441145b.contains(grsBaseInfo.getRegCountry())) {
                    concurrentHashMap.put(grsBaseInfo.getRegCountry(), c49419b.f441144a);
                }
                if (c49419b.f441145b.contains(grsBaseInfo.getSerCountry())) {
                    concurrentHashMap.put(grsBaseInfo.getSerCountry(), c49419b.f441144a);
                }
                if (c49419b.f441145b.contains(str2)) {
                    Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                    concurrentHashMap.put(str2, c49419b.f441144a);
                }
            }
            obj = concurrentHashMap.get(str2);
        }
        w01.d dVar = (w01.d) map.get((String) obj);
        if (dVar == null) {
            return null;
        }
        return dVar.f441150b;
    }

    public abstract int e(String str);

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[PHI: r10
  0x005a: PHI (r10v5 java.lang.String) = (r10v0 java.lang.String), (r10v1 java.lang.String) binds: [B:17:0x0058, B:20:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[PHI: r5
  0x00ae: PHI (r5v8 java.lang.String) = (r5v6 java.lang.String), (r5v7 java.lang.String) binds: [B:29:0x00ac, B:32:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(org.json.JSONArray r14) throws org.json.JSONException {
        /*
            r13 = this;
            if (r14 == 0) goto Lde
            int r0 = r14.length()
            if (r0 != 0) goto La
            goto Lde
        La:
            r0 = 0
            r1 = r0
        Lc:
            int r2 = r14.length()
            if (r1 >= r2) goto Lde
            org.json.JSONObject r2 = r14.getJSONObject(r1)
            w01.c r3 = new w01.c
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.getString(r4)
            java.util.HashSet r5 = r13.f363524g
            boolean r6 = r5.contains(r4)
            if (r6 != 0) goto Lda
            r5.add(r4)
            boolean r5 = r13.f363522e
            if (r5 == 0) goto Lda
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r2.getString(r5)
            r3.f441146a = r5
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r2.getJSONArray(r5)
            r6 = r0
        L3f:
            int r7 = r5.length()
            java.lang.String r8 = "AbstractLocalManager"
            if (r6 >= r7) goto La6
            java.lang.Object r7 = r5.get(r6)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            w01.d r9 = new w01.d
            r9.<init>()
            java.lang.String r10 = "countryOrAreaGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L5f
        L5a:
            java.lang.String r8 = r7.getString(r10)
            goto L73
        L5f:
            java.lang.String r10 = "countryGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L68
            goto L5a
        L68:
            java.lang.Object[] r10 = new java.lang.Object[]{r4}
            java.lang.String r11 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r8, r11, r10)
            java.lang.String r8 = "no-country"
        L73:
            r9.f441149a = r8
            java.lang.String r8 = "addresses"
            org.json.JSONObject r7 = r7.getJSONObject(r8)
            java.util.HashMap r8 = new java.util.HashMap
            r10 = 16
            r8.<init>(r10)
            java.util.Iterator r10 = r7.keys()
        L86:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L9a
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r7.getString(r11)
            r8.put(r11, r12)
            goto L86
        L9a:
            r9.f441150b = r8
            java.lang.String r7 = r9.f441149a
            java.util.HashMap r8 = r3.f441147b
            r8.put(r7, r9)
            int r6 = r6 + 1
            goto L3f
        La6:
            java.lang.String r5 = "countryOrAreaGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Lb7
        Lae:
            org.json.JSONArray r2 = r2.getJSONArray(r5)
            java.util.ArrayList r2 = c(r2)
            goto Lc6
        Lb7:
            java.lang.String r5 = "countryGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Lc0
            goto Lae
        Lc0:
            java.lang.String r2 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.i(r8, r2)
            r2 = 0
        Lc6:
            r3.f441148c = r2
            w01.a r2 = r13.f363518a
            if (r2 != 0) goto Ld3
            w01.a r2 = new w01.a
            r2.<init>()
            r13.f363518a = r2
        Ld3:
            w01.a r2 = r13.f363518a
            java.util.HashMap r2 = r2.f441143b
            r2.put(r4, r3)
        Lda:
            int r1 = r1 + 1
            goto Lc
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.f.a.f(org.json.JSONArray):void");
    }

    public final int g(String str) {
        try {
            f(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e12) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e12.getMessage()));
            return -1;
        }
    }

    public abstract int h(String str);
}
